package HyperSkill;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Cinema_fei
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //set total rows
    int m = sc.nextInt(); //set seats on each row
    int[][] seatMap = new int[n][m];
    int continuousAvailableSeat;
    int emptySeat = 0;
    int[] seatOnRow = new int[n];
    int row=0;

    // get user input seatmap
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        seatMap[i][j] = sc.nextInt();
      }
    }

    // get required ticket number
    int k = sc.nextInt();

    //check available empty seats on each row
    for (int i=0; i<seatMap.length; i++){
      continuousAvailableSeat=0;
      emptySeat=0;
      for(int j=0; j<seatMap[i].length; j++){
        //check how many continuous empty seat
        if(seatMap[i][j] == 0){
          continuousAvailableSeat++;
        }
        //reture the row number then seats are available on this current row and stop searching
        if (continuousAvailableSeat >= k){
          emptySeat = continuousAvailableSeat;
        }
        //reset continuousAvailableSeat value when it break;
        if (seatMap[i][j] !=0){
          continuousAvailableSeat = 0;
        }
      }
      seatOnRow[i]=emptySeat;
      System.out.println(seatOnRow[i]);
    }

    int result = 21;
    for(int i=0;i<seatOnRow.length;i++){
      if(seatOnRow[i]>=k && seatOnRow[i]<result){
        result = seatOnRow[i];
        row = i+1;
      }
      k++;
    }
    System.out.println(row);
  }
}

