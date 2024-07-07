public class program1 {
  public static class Student {
    int age;
    float percentage;
    String name;
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Dilsad";
    s1.age = 22;
    s1.percentage = 81;
    System.out.println(s1.name);
  }
}
