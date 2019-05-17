package HyperSkill;
import java.util.Scanner;

public class symmetricMatrix
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] matrix = new int[n][n];
    boolean symmetric = true;

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < matrix[i].length; j++)
      {
        if (matrix[i][j] != matrix[j][i])
        {
          symmetric = false;
          break;
        }
      }
    }
    if (symmetric == true)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}
  /** correct answer
   * import java.util.Scanner;
   *
   * public class Main {
   *     public static void main(String[] args) {
   *         Scanner scanner = new Scanner(System.in);
   *         int len = scanner.nextInt();
   *         int[][] numbers = new int[len][len];
   *
   *         for (int i = 0; i < len; i++) {
   *             for (int j = 0; j < len; j++) {
   *                 numbers[i][j] = scanner.nextInt();
   *             }
   *         }
   *
   *         for (int i = 0; i < numbers.length; i++) {
   *             for (int j = i + 1; j < numbers.length; j++) {
   *                 if (numbers[i][j] != numbers[j][i]) {
   *                     System.out.println("NO");
   *                     return;
   *                 }
   *             }
   *         }
   *
   *         System.out.println("YES");
   *     }
   * }
   */

