import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_number = sc.nextInt();
        int ans = 0; // converted decimal number
        int pw = 1;// 2^0 =1 power of 2
        sc.close();
        while (binary_number > 0) {
            int unit_digit = binary_number % 10;
            ans += (unit_digit * pw);
            binary_number /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
