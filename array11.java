import java.util.*;

public class array11 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}