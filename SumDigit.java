import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int num=sc.nextInt();
        int res=0;
        while(num>0){
            res+=num%10;
            num=num/10;
        }
        System.out.println(res);
    }
}
