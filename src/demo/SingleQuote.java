package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingleQuote {

	public static void main(String[] args) {
		
		String s1 = "My name is 'Mohammad' i am from 'pune'";
		
		 Pattern pattern = Pattern.compile("'(.*?)'");
		 
		//Pattern pattern = Pattern.compile(".*'([^']*)'.*");
		
		
		
		 Matcher matcher = pattern.matcher(s1);
		 
		 if(matcher.find())
		 {
			 String extractedString = matcher.group(1);
	         System.out.println(extractedString);
		 }

	}

}
