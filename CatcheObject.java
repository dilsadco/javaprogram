public class CatcheObject {
    public static void main(String[] args) {
        Integer i1 = 120;
        Integer i2 = 120;
        System.out.println(i1 == i2);
        Integer i3 = 130;
        Integer i4 = 130;
        System.out.println(i3 == i4);
        Integer b1 = 120;
        // Byte b2 = 120;
        // System.out.println(b1==b2);
        System.out.println(b1.equals(i1));
        int a = 20;
        byte b = 20;
        System.out.println(a == b);
    }
}
