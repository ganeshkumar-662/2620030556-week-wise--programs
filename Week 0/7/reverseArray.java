
import java.util.Scanner;
public class reverseArray{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] a = new int[5];
 System.out.println("Enter 5 array elements:");
 for (int i = 0; i < 5; i++) {
 a[i] = sc.nextInt();
}
 System.out.println("Reverse of array:");
 for (int i = 4; i >= 0; i--) {
 System.out.print(a[i] + " ");
}
sc.close();
}
}
