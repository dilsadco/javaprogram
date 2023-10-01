import java.util.Scanner;

class ReversNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int rev = 0;
        int res = 0;
        while (num > 0) {
            res = num % 10;
            num = num / 10;
            rev = res + (rev * 10);
        }
        System.out.println(rev);
    }
}