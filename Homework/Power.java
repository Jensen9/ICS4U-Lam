import java.util.Scanner;

public class Power {
   public static int power (int x, int n, int sum) {
      if (n == 0) {
         return 1;
      } else if (n == 1) {
         return sum;
      } else {
         return power(x, (n - 1), (sum * x));
      }  
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int x = in.nextInt();
      System.out.print("Enter the power: ");
      int n = in.nextInt();
      
      int result = power(x, n, x);
      System.out.println(x + " to the power of " + n + " is " + result);
   }
}
