package demo;

import java.util.Set;
import java.util.TreeSet;

public class MultipleStringInOneString {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2= "Selenium";
		String s3 = "TestNG";
		
		Set<String> setinput = new TreeSet<>();
		
		setinput.add(s1);
		setinput.add(s2);
		setinput.add(s3);
		
		System.out.println(setinput);

	}

}
