import java.util.Scanner;

public class BinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0, pow = 1;
        int BNumber = sc.nextInt();
        sc.close();
        while (BNumber > 0) {
            int UnitDigit = BNumber % 10;
            res += (UnitDigit * pow);
            BNumber = BNumber / 10; // BNumber/=10;
            pow = pow * 2; // pow*=2;
        }
        System.out.println(res);

    }
}
