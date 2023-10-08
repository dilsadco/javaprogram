import java.util.Scanner;
public class ArrayThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row order :");
        int m= sc.nextInt();
        System.out.println("Enter column order :");
        int n=sc.nextInt();
        int [][]arr=new int [m][n];
        System.out.println("Enter your First element :");
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
             arr[i][j]=sc.nextInt();
            }
        }
        int [][]arr1=new int [m][n];
        System.out.println("Enter your Second element :");
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int [][]arr3=new int [m][n];
        System.out.println("Sum of first and second elements are :");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr3[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
