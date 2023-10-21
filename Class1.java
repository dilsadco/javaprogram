class Employee {
  int salary;
  String name;

  public int getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }
}

public class Class1 {
  public static void main(String[] args) {
    Employee obj = new Employee();
    obj.setName("Dilsad");
    obj.salary = 1200;
    System.out.println(obj.getName());
    System.out.println(obj.salary);
  }
}
