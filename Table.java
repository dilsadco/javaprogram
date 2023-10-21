/* 9. Write a program to display tables from 2 to 10. */
//import java.util.Scanner;
class Table {
    public static void main(String[] args) {
        int n = 10;
        for (n = 1; n <= 10; n++) {
            for (int i = 2; i <= 10; i++) {
                System.out.print(n * i + "\t");
            }
            System.out.println();
        }
    }
}
