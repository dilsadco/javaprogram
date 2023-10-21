
/* 5. Write a program to display reverse of a digit no. using array. */
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int arr[] = new int[10];
        int size = arr.length;
        sc.close();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
