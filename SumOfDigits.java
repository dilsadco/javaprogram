import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();
        sc.close();
        int ans = 0;
        while (num > 0) {
            ans += num % 10; // ans=ans+num%10;
            num = num / 10;
        }
        System.out.println(ans);
    }
}
