package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter a String1: ");
		String Str1 = enter.next();
		System.out.println("Enter a String2: ");
		String Str2 = enter.next();
		
		if(Str1.equalsIgnoreCase(Str2)) System.out.println("The two strings are the same.");
		else System.out.println("The two strings are not the same.");
	}

}
