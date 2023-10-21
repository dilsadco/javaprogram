class Student {
  private int id;
  private String name;

  public Student(int a, String n) {
    id = a;
    name = n;
  }

  // public void setId(int a) {
  // id = a;
  // }

  // public void setName(String s) {
  // name = s;
  // }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}

public class Constractor {
  public static void main(String[] args) {
    Student stu = new Student(1, "Dilsad");
    Student stu1 = new Student(2, "Abdul");
    System.out.println(stu.getId());
    System.out.println(stu.getName());
    System.out.println(stu1.getId());
    System.out.println(stu1.getName());
  }
}
