import java.util.Scanner;

public class Stringtut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence :");
        String name;
        name = sc.nextLine();
        int value = name.length();
        sc.close();
        System.out.println(value);
        String names = name.toLowerCase();
        System.out.println(names);
        String namee = name.toUpperCase();
        System.out.println(namee);

    }
}
