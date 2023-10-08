import java.util.Scanner;
public class DecimalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decnum=sc.nextInt();
        int ans=0;
        int pw=1;
        while(decnum>0){
            int parity=decnum%2;
            ans+=(parity * pw);
            pw*=10;
            decnum/=2;
        }
        System.out.println(ans);
    }
}
