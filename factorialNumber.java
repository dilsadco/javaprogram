import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first n number ");
        int num = sc.nextInt();
        double fact = 1;
        sc.close();
        for (int i = 0; i <= num; i++) {
            if (i == 0) {
                fact = 1;
            } else {
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}
