import java.util.Scanner;
class Person{
    int age;
    String name;
    int balance=1000;

}
public class OOps1 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=20;
        p1.name="Dilsad";
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.balance);
      //  System.out.println(Person.balance); balance is a non-static variable so can't access without
      // object creating (if balance is a static variable so without creating object access the person class
        // balance in OOps class )

        Person p2=new Person();
        p2.age=21;
        p2.name="Seraj";
        System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p2.balance);
    }
}
