public class appends {
    public static void main(String[] args) {
      StringBuilder name=new StringBuilder("Abhimanyu");
      name.append(" Kumar");
      name.insert(0," Student name ");
      name.delete(8,12);
      name.replace(10,18,"name");
      name.reverse();
        System.out.println(name);
    }
}
