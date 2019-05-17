package HyperSkill;
import java.util.Scanner;

public class busTour
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] userInput = new int[2];
    for(int j=0;j<2;j++){
      userInput[j]=sc.nextInt();
    }
    int height = userInput[0];
    int bridge = userInput[1];

    int[] bridgeHeight = new int[bridge];

    Scanner sc2 = new Scanner(System.in);
    for (int i=0; i<bridge;i++){
      bridgeHeight[i] = sc2.nextInt();
      if (height>=bridgeHeight[i]){
        System.out.println("Will crash on bridge "+(i+1));
        break;
      }
    }
    if(height<bridgeHeight[bridge-1]){
      System.out.println("Will not crash");
    }
  }
}
