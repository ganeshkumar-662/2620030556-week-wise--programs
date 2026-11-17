
import java.util.Scanner;
public class Evenplace {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
 int n = sc.nextInt();
n = Math.abs(n);
 int sum = 0;
 int place = 1;
  while (n != 0) {
   int digit = n % 10;
   if (place % 2 == 0) {
   sum = sum + digit;
  }
  n = n / 10;
 place++;
}
System.out.println("Sum of even places = " + sum);
sc.close();
    }
}
