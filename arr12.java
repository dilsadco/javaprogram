import java.util.*;

public class arr12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }

}
