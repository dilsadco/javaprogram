import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();
        int ans = 0;
        sc.close();
        while (num > 0) {
            ans = ans * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println(ans);
    }
}
