import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1; i<=num; i++){
            if(i%2==0) {
                even=even+i;
            }else{
              odd=odd+i;
            }
            }
        System.out.println(odd-even);
    }
}
