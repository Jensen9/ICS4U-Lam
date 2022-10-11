import java.util.Scanner;

public class Prime {
   public static boolean prime (int n, int d) {
      if (d == 1) {
         return true;
      } else if (n % d == 0) {
         System.out.println("Divisible by " + d);
         return false;
      } else {
         return prime(n, (d - 1));
      }
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int n = in.nextInt();
      int d = n - 1;
      
      boolean prime = prime(n, d);
      if (prime) {
         System.out.println(n + " is a prime number");
      } else {
         System.out.println(n + " is not a prime number");
      }
   }
}
