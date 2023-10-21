import java.util.*;

public class ArrayFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
