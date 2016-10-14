package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		String Str1,Str2;
		boolean a;
		Scanner enter = new Scanner(System.in);
		
		do{System.out.println("Enter a String1: ");
		Str1 = enter.next();
		System.out.println("Enter a String2: ");
		Str2 = enter.next();
		a=Str1.equalsIgnoreCase(Str2);
		}while(!a);
		
		System.out.println("The two strings are the same.");

	}

}
