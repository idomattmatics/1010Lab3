import java.util.Scanner;


public class fourdigitnumber {
	/**
	 * Purpose: Learn and apply arithmetic in Java and calling characters
	 * in a string using type casting methods
	 * Matthew Kachar	
	 * January 30th, 2014
	 */
	
	
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
	
	System.out.print("Enter a four digit number:");
		
		String s = keyboard.next();
		int a = s.charAt(0)-'0';
		int b = s.charAt(1)-'0';
		int c = s.charAt(2)-'0';
		int d = s.charAt(3)-'0';
		
		int sum = (a + b + c + d);
		System.out.println("The output is:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
	System.out.println("The sum of the numbers is:" + sum);
			System.out.println("The reverse would be:" + d+c+b+a);
	
	
	
	
	
	
	}

	
	}
	

