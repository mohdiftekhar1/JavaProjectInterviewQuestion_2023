package demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1= "Silent";
		String s2 = "Listen";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
	Boolean result = 	Arrays.equals(c1, c2);

	if(result == true)
	{
		System.out.println("Strings are Anangram");
	}
	else
	{
		System.out.println("Strings are not  Anangram");
	}
	
	
	}

}
