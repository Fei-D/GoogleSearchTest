package HyperSkill;
import java.util.Scanner;

public class theSequence
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int size=0;
    if(n>0)
    {
      for (int i = 0; i < n; i++)
      {
        for (int num = 1; num <= n; num++)
        {
          for (int k = 0; k < num; k++)
          {
            if (size == n)
            {
              break;
            }
            System.out.print(num + " ");
            size++;
          }
        }
      }
    }
  }
}
  /**
   * import java.util.Scanner;
   *
   * class Main {
   *     public static void main(String[] args) {
   *         Scanner scanner = new Scanner(System.in);
   *
   *         int n = scanner.nextInt();
   *         int current = 1;
   *         int count = 0;
   *
   *         while (count != n) {
   *             for (int i = 0; i < current; i++) {
   *                 System.out.println(current);
   *                 count += 1;
   *
   *                 if (count == n) {
   *                     break;
   *                 }
   *             }
   *             current += 1;
   *         }
   *     }
   * }
   */

