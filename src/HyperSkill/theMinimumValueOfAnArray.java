package HyperSkill;
import java.util.Scanner;

public interface theMinimumValueOfAnArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    int small;

    for (int i =0;i<size; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<size; i++){
      for(int j=i+1; j<size ; j++){
        if(arr[i]<= arr[j]){
          small = arr[j];
          arr[j] = arr[i];
          arr[i] = small;
        }
      }
    }
    System.out.println(arr[size-1]);
  }
}
  /***correct answer
   * import java.util.Scanner;
   *
   * class Main {
   *     public static void main(String[] args) {
   *         final Scanner scanner = new Scanner(System.in);
   *         final int[] array = new int[scanner.nextInt()];
   *         int min = Integer.MAX_VALUE;
   *
   *         for (int i = 0; i < array.length; i++) {
   *             array[i] = scanner.nextInt();
   *             if (min > array[i]) {
   *                 min = array[i];
   *             }
   *         }
   *
   *         System.out.println(min);
   *     }
   * }
   */

