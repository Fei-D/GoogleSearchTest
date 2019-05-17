package HyperSkill;

import java.util.Scanner;

public class longestAscending
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);// put your code here
    int size = sc.nextInt();
    int[] arr = new int[size]; // get user setup arr[] size
    int countMax = 1;
    int max = 0;
    int i;

    for (i = 0; i < size; i++) // get user key in all elements to the arr[]
    {
      arr[i] = sc.nextInt();
    }
    if (size == 1)
    { //check if the size =1;
      System.out.println(size);
    }
    else //when size > 1
    {
      for (i = 1; i < size ; i ++)
      {
        if (arr[i] > arr[i - 1]) // when arr[1]> arr[0] count +1;
        {
          countMax++;
        }
        else    //when arr[1]<=arr[0] count =1;
        {
          countMax = 1;
        }
        if (countMax > max) //when count > max, max = count;
        {
          max = countMax;
        }
      }
       System.out.println(max); //output the value of max
    }
  }
}

  /** correct answer
   * import java.util.Scanner;
   *
   * class Main {
   *     public static void main(String[] args) {
   *         Scanner scanner = new Scanner(System.in);
   *         int n = scanner.nextInt();
   *
   *         int[] arr = new int[n];
   *         for (int i = 0; i < n; i++) {
   *             arr[i] = scanner.nextInt();
   *         }
   *
   *         int max = 1;
   *         for (int i = 1; i < n; i++) {
   *             int best = 1;
   *             while (i < n && arr[i] > arr[i - 1]) {
   *                 best++;
   *                 i++;
   *             }
   *             max = Math.max(max, best);
   *         }
   *
   *         System.out.println(max);
   *     }
   * }
   */





