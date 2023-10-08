/* Write a program to find sum & average of 10 no. using arrays. */
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float []arr=new float [10];
        float sum=0;
        System.out.println("Enter any 10 numbers : ");
        for(int i=0; i<10; i++){
            arr[i]=sc.nextFloat();
        }
        for(int i=0; i<10; i++){
            sum=arr[i]+sum;
        }
        System.out.println("10 Number of sum is : " +sum);
        System.out.println("10 Number of average is : "+sum/10);
    }
}
