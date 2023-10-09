package demo;

public class PrintOnlyAlphabet {

	private static String regex;
	private static String replacement;

	public static void main(String[] args) {
		
		String s1 = "Mohammad123456789Iftekhar10111213@!#";
		String s2 = "sulbha45245@#₹₹";
		String s3 = "iftekhar123456";
		System.out.println(s1);
		
		//String newStr = s1.replaceAll("[^a-zA-Z]", "");
		
		//System.out.println(newStr);
		
		//Extract Alphabet
		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
		
		
		// Extract number
		System.out.println(s1.replaceAll("[^0-9]", ""));
		
		System.out.println(s2.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s3.replaceAll("[^a-zA-Z]", ""));
	}

}
