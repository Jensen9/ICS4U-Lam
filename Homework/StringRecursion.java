public class StringRecursion {
	public static int length(String s) {
		if(s.equals("")) {
			return 0;
		}
		else {
			return 1 + length(s.substring(1));
		}
	}
	
	public static boolean equalsIgnoreCase(String s1, String s2) {
		final int DIFFERENCE = 'a' - 'A';
		if(s1.length() == s2.length()) {
			if(s1.length() == 0 && s2.length() == 0) {
				return true;
			}
			else if(s1.charAt(0) == s2.charAt(0) || s1.charAt(0) + DIFFERENCE == s2.charAt(0) || s1.charAt(0) == s2.charAt(0) + DIFFERENCE) {
				return equalsIgnoreCase(s1.substring(1), s2.substring(1));
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public static int countChar(String s, char c) {
		if(s.length() == 0) {
			return 0;
		}
		else {
			if(s.charAt(0) == c) {
				return 1 + countChar(s.substring(1), c);
			}
			else {
				return countChar(s.substring(1), c);
			}
		}
	}
	
	public static boolean equalsIgnoreVowel(String s1, String s2) {
		s1 = s1.replaceAll("[aeiouAEIOU]", "");
		s2 = s2.replaceAll("[aeiouAEIOU]", "");
		
		final int DIFFERENCE = 'a' - 'A';
		if(s1.length() == s2.length()) {
			if(s1.length() == 0 && s2.length() == 0) {
				return true;
			}
			else if(s1.charAt(0) == s2.charAt(0) || s1.charAt(0) + DIFFERENCE == s2.charAt(0) || s1.charAt(0) == s2.charAt(0) + DIFFERENCE) {
				return equalsIgnoreCase(s1.substring(1), s2.substring(1));
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public static String moveToEnd(String s, char x) {
		if(s.isEmpty() == true) {
			return "";
		}
		else {
			if(s.charAt(0) == x) {
				return moveToEnd(s.substring(1), x) + x;
			}
			else {
				return s.charAt(0) + moveToEnd(s.substring(1), x);
			}
		}
	}
	
	public static String reverse (String s) {
		if(s.length() < 1) {
			return "";
		}
		else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}
	
	public static boolean palindrome (String s) {
		if(s.length() <= 1) {
			return true;
		}
		else { 
			if(s.charAt(0) == s.charAt(s.length() - 1)) {
				return palindrome(s.substring(1, s.length() - 1));
			}
			else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(length(""));
		System.out.println(length("test"));
		
		System.out.println(equalsIgnoreCase("", ""));
		System.out.println(equalsIgnoreCase("Test", "TeST"));
		
		System.out.println(countChar("XaaaYaaaZaaaYaaaaY", 'Y'));
		
		System.out.println(equalsIgnoreVowel("kangeroo", "kongeroo"));
		
		System.out.println(moveToEnd("How are you", 'o'));
		
		System.out.println(reverse("this is a sentence"));
		
		System.out.println(palindrome("racecar"));
	}
}
