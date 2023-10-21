import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter countable number : ");
        int num = sc.nextInt();
        int numofdig = 0;
        sc.close();
        while (num > 0) {
            num = num / 10;
            numofdig++;
        }
        System.out.println(numofdig);
    }
}
