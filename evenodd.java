import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
