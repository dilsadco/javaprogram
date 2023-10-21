import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row ");
        int a = sc.nextInt();
        System.out.print("Enter column ");
        int b = sc.nextInt();
        sc.close();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
