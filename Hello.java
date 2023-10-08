// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        int count=0;
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int r=sc.nextInt();
        for(int i=l; i<r; i++){
            if(1<=l&&l<=r&&r<N){
                if(A[i]==1){
                    A[i]=0;
                }else{
                    A[i]=1;
                }
            }
        }
        for(int i=0; i<N; i++){
            if(1==A[i]){
               count++;
            }
        }
        System.out.println(count);
    }
}