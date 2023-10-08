public class Pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=15;j++){
                if(j<=5){
                System.out.print("*"+" ");
            }else if(j>=5&&j<=10){
                    System.out.print("  ");
                }else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
