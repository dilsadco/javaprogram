class Area {
  private int height;
  private int length;

  public Area(int h, int l) {
    height = h;
    length = l;
  }
  // public void setHeight(int height) {
  // this.height = height;
  // }

  // public void setLength(int length) {
  // this.length = length;
  // }

  public int getHeight() {
    return height;
  }

  public int getLenghth() {
    return length;
  }

  public int rectangle() {
    return height * length;
  }

}

public class Constractor2 {
  public static void main(String[] args) {
    Area are = new Area(5, 7);
    // are.setHeight(5);
    // are.setLength(4);
    System.out.println(are.getHeight());
    System.out.println(are.getLenghth());
    System.out.println(are.rectangle());
  }
}
