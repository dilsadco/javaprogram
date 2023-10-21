//import java.util.*;
public class TeamConst {
    String name;

    TeamConst(String n1) {
        name = n1;
    }

    void display() {
        System.out.println("Employee id :" + name);

    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter employee id ");
        // num=sc.nextInt();
        // System.out.println("Enter employee name ");
        // String n1=new String (n1);
        TeamConst t1 = new TeamConst("dilsad");
        t1.display();
    }
}
