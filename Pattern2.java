import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int a=3,b=3;
        for(int i=1; i<=3; i++){
            for(int j=i; j<=3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}