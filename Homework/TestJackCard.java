import java.util.Scanner;

public class TestJackCard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		JackCard c1 = new JackCard();
		JackCard c2 = new JackCard("Bobby", 600, 3443);
		
		System.out.print("Enter maximum balance: ");
		JackCard.setMaxBalance(in.nextDouble());
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.refill(50));
		
		System.out.println(c2.pay(60, 3443, false));
		
		JackCard c3 = c1.higherBalance(c2);
		System.out.println(c3.pay(10, c3.getPIN(), false));
		
		JackCard c4 = c1.morePoints(c2);
		System.out.println(c4.pay(5, c4.getPIN(), true));
		
		c1.combinePoints(c2);
		
		System.out.println(c1.pay(5, 1234, true) + "\n");
		
		System.out.print("Enter Username for c1: ");
		String checkName = in.next();
		System.out.print("Enter new PIN: ");
		int newPin = in.nextInt();
		
		c1.changePIN(checkName, newPin);
		
		System.out.println("\n" + c1);
		System.out.println(c2);
	}
}
