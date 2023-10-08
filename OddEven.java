/* 3. Write a program called OddEven which prints "Odd Number" if the int variable "number" is odd, or "Even Number" otherwise */
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number= sc.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
