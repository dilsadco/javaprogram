class Student {
  private String name;
  private int id;

  public void setName(String n) {
    name = n;
  }

  public void setId(int a) {
    id = a;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
}

public class PrivateModifier {
  public static void main(String[] args) {
    Student stu = new Student();
    stu.setName("Dilsad");
    stu.setId(1);
    System.out.println(stu.getId());
    System.out.println(stu.getName());

    Student stu1 = new Student();
    stu1.setId(2);
    stu1.setName("Abdul");
    System.out.println(stu1.getId());
    System.out.println(stu1.getName());
  }
}
