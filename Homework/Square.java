import java.util.Scanner;

public class Square {
   public static int square(int n) {
      if (n == 1) {
         return 1;
      } else {
         return square(n-1) + ((2 * n) - 1);
      }
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int n = in.nextInt();
      
      int result = square(n);
      System.out.println(n + " squared is " + result);
   }
}
