
//import java.util.*;
import java.util.Scanner;

class Reverce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int res = 0;
        int rev = 0;
        while (0 < num) {
            res = num % 10;
            num = num / 10;
            rev = res + (rev * 10);
        }
        System.out.println(rev);
    }
}