import java.util.*;
public class minmax {
   static int max_of_max(int a,int b, int c, int d){

       return Math.max(Math.max(a,b),Math.max(c,d));
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        //int ans=max_of(a,b,c,d);
        System.out.println(max_of_max(a,b,c,d));
    }
}
