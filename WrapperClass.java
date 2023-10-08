public class WrapperClass {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer("Hello");
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            buf.append(" Student");

        }
        System.out.println("Buffer took time " + (System.currentTimeMillis() - time));

        StringBuilder buff = new StringBuilder("Hello");
         time = System.currentTimeMillis();
        for (int j = 0; j < 1000000; j++) {
            buff.append(" Student");

        }
        System.out.println("Builder took time " + (System.currentTimeMillis() - time));
    }
}

