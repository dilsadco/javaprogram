/* 2. write a program called PassFail which prints "PASS" if the int variable "mark"
is more than or equal to 50; or prints "FAIL" otherwise */
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        System.out.print("Enter your marks : ");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
