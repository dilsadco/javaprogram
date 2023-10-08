import java.util.*;
public class Array2 {
    public static void main(java.lang.String []args) {
        String vowel[]=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; vowel.length>i; i++){
            vowel[i]=sc.nextLine();
        }
        for(int i=0; vowel.length>i; i++){
            System.out.println(vowel[i]);
        }
    }
}
