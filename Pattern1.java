import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=4,b=5;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
