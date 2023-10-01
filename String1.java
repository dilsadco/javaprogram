public class String1 {
    public static void main(String[] args) {
        String firstname = "Dilsad";
        String secondname = "Ansari";
        String fullname = firstname + " " + secondname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

    }

}
