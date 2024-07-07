import java.util.Scanner;

public class TCSCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int NumOfCoine = sc.nextInt();
    int NumOfTurm = sc.nextInt();
    int chooseNum = 4;
    int count = 0;
    int arr[] = new int[NumOfCoine];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] == chooseNum) {
        count++;
      }
    }
    System.out.println((chooseNum * count) + count);
    sc.close();
  }
}
