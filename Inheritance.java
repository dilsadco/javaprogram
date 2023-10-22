class Base {
  int x;

  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public int squire() {
    return x * x;
  }
}

class Derived extends Base {
  int y;

  public void setY(int y) {
    this.y = y;
  }

  public int getY() {
    return y;
  }

  public int quibe() {
    return y * y * y;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    // Object creating for base class
    Base b = new Base();
    b.setX(45);
    System.out.println(b.getX());
    System.out.println(b.squire());
    // Object creating for derived class
    Derived d = new Derived();
    d.setX(20);
    System.out.println(d.getX());
    System.out.println(d.squire());
    d.setY(15);
    System.out.println(d.getY());
    System.out.println(d.quibe());
  }
}
