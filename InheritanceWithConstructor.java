class Base {
  Base() {
    System.out.println("I am a base class constructor");
  }

  Base(int x) {
    System.out.println("I am a base class with argurment constructor " + x);
  }
}

class Derived1 extends Base {
  Derived1() {
    System.out.println("I am a Derived1 class constructor");
  }

  Derived1(int x, int y) {
    super(x);
    System.out.println("I am a derived1 class with two argument constructor " + x + " " + y);
  }
}

class Derived2 extends Derived1 {
  Derived2() {
    System.out.println("I am derived2 class constructor");
  }

  Derived2(int x, int y, int z) {
    super(x, y);
    System.out.println("I am derived2 class constructor with three argument " + x + " " + y + " " + z);
  }
}

public class InheritanceWithConstructor {
  public static void main(String[] args) {
    // Derived2 d2 = new Derived2();
    Derived2 d22 = new Derived2(12, 15, 20);
  }
}
