public class StudentClass{
    int rollNo;
    String name;

    public static void main(String[] args) {
        StudentClass obj1=new StudentClass();
        obj1.rollNo=111;
        obj1.name="Sani";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.name);
        StudentClass obj2=new StudentClass();
        obj2.rollNo=112;
        obj2.name="Akash";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.name);
    }
}