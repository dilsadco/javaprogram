import java.util.Scanner;
public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number ");
        int BinaryN=sc.nextInt();
        int i=0, res;double BinaryNumbe=0;
        while(BinaryN>0){
            res=BinaryN%10;
            BinaryN=BinaryN/10;
            BinaryNumbe=BinaryNumbe+res*(Math.pow(2,i));
            i++;
        }
        System.out.println(BinaryNumbe);
    }
}
