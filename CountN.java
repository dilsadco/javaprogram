import java.util.Scanner;

public class CountN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter countable number ");
        int num = sc.nextInt();
        int count = 0;
        sc.close();
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
