import java.util.Scanner;
class palindrom{
    public static void main(String[] args) {
        String reverse=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        int length=str.length();
        for(int i=length-1; i>=0; i--){
            reverse= reverse +str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println(str+" is a palindrom");
        }else{
            System.out.println(str+" is not a palindrom");
        }
    }
}