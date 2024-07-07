import java.util.Arrays;
import java.util.Scanner;

public class program2 {

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static int[] reverseArray(int[] arr) {
    int j = 0;
    int[] ans = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      ans[j++] = arr[i];
    }
    return ans;
  }

  static int[] sortArray(int[] arr) {
    Arrays.sort(arr);
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter our array size:");
    int num = sc.nextInt();
    int[] arr = new int[num];
    System.out.println("Enter our array numbers:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    printArray(arr);
    int[] ans = reverseArray(arr);
    System.out.println("This is your reversed array:");
    printArray(ans);
    printArray(sortArray(arr));
    sc.close();
  }
}
