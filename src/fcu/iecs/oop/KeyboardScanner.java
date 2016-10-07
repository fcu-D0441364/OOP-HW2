package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter a integer: ");
		int intnum = enter.nextInt();
		
		System.out.println("Enter a float point number: ");
		float fnum = enter.nextFloat();
		
		System.out.println("Enter a you name: ");
		String name = enter.next(); 
		
		String mul = String.format("%.2e", fnum*intnum);
		
		System.out.println("Hi "+ name +",the multiplication of " + intnum + "and " + fnum +"is " + mul);
		
	}
}
