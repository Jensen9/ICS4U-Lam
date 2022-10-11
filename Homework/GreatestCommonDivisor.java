import java.util.Scanner;

public class GreatestCommonDivisor {
   public static int gcd(int m, int n) {
      if (m == n) {
         return m;
      } else if (m > n) {
         return gcd(n, (m-n));
      } else {
         return gcd(n, m);
      }
      
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("First Number: ");
      int m = in.nextInt();
      System.out.print("Second Number: ");
      int n = in.nextInt();
      
      int gcd = gcd(m, n);
      
      System.out.println("\nThe GCD of the two is " + gcd);
   }
}
