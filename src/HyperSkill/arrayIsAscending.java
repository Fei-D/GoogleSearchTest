package HyperSkill;
import java.util.Scanner;

public class arrayIsAscending
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    boolean ascending = true;
    int size = sc.nextInt();
    int[] order = new int[size];

    for (int i=0; i<size; i++){
      order[i] = sc.nextInt();
    }
    for (int i=1; i<size; i++){
      if(order[i]<order[i-1]){
        ascending = false;
        break;
      }
    }
    System.out.println(ascending?"true":"false");
  }
}
  /**correct ansser
   * import java.util.Scanner;
   *
   * class Main {
   *     public static void main(String[] args) {
   *         Scanner scanner = new Scanner(System.in);
   *
   *         int n = scanner.nextInt();
   *         int[] numbers = new int[n];
   *
   *         for (int i = 0; i < numbers.length; i++) {
   *             numbers[i] = scanner.nextInt();
   *         }
   *
   *         boolean asc = true;
   *
   *         for (int i = 0; i < numbers.length - 1 && asc; i++) {
   *             if (numbers[i] > numbers[i + 1]) {
   *                 asc = false;
   *             }
   *         }
   *
   *         System.out.println(asc);
   *     }
   * }
   */

