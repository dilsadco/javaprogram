import java.util.*;
public class two_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter number of row ");
     //   int m = sc.nextInt();
     //   System.out.println("Enter number of column ");
     //   int n = sc.nextInt();
        int m=3;
        int n=3;

        int[][] arr = new int[m][n];
        System.out.println("Enter the number of element ");
        for (int i = 0; i < m; i++) {
            //Loop for number of row
            for (int j = 0; j < n; j++) {
                // Inner Loop for number of column
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Element of the array is :");
        for (int i = 0; i < m; i++) {
            //Loop for number of row
            for (int j = 0; j < n; j++) {
                // Inner Loop for number of column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}