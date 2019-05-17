package HyperSkill;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Cinema
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder input = new StringBuilder();
    while(sc.hasNextLine()) {
      input.append(sc.nextLine());
      input.append("\n");
    }

    System.out.println(solve(input.toString()));
  }


  public static int solve(String input)
  {
    Scanner sc = new Scanner(input);        // put your code here
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] seatMap = new int[r][c];
    int continuousAvailableSeat;
    int sequenceAvailable;
    int currentRow = 0;
    int[] allRows = new int[r];
    int i;
    int j;

    //getting the current seatMap
    for (i = 0; i < r; i++)
    {
      for (j = 0; j < c; j++)
      {
        seatMap[i][j] = sc.nextInt();
      }
    }
    int k = sc.nextInt();

    //check out which row got the available seats
    if (r <= 20 && c <= 20)
    {
      for (i = 0; i < seatMap.length; i++) {
        continuousAvailableSeat = 0;
        sequenceAvailable = 0;
        for (j = 0; j < seatMap[i].length; j++)
        {
          if (seatMap[i][j] == 0) //check sequence of empty seats in same row
          {
            continuousAvailableSeat++;
            sequenceAvailable++;
          }
          if (continuousAvailableSeat >= k)
          {   //if there are available seats found return the current row number.
            return i + 1;
          }
          if (seatMap[i][j] != 0)
          {
            continuousAvailableSeat = 0;
          }
        }
        if (currentRow > i)
        {
          allRows[i] = sequenceAvailable;
        }
        else
        {
          sequenceAvailable = 0;
          allRows[i] = sequenceAvailable;
        }
      }

      return 0;
    }
    else
    {
      return 0;
    }
  }
}

