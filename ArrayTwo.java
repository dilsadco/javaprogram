import java.util.*;
class Algebra{
  int add(int a,int b){
      int ans=a+b;
      return ans;
  }
}
public class ArrayTwo {

    public static void main(String[] args) {
        Algebra obj1=new Algebra();
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int y=sc.nextInt();
        System.out.println("Addition of two no is");
        System.out.println(obj1.add(x,y));

    }
}
