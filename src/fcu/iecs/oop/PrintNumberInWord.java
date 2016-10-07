package fcu.iecs.oop;
import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		String a;
		System.out.println("Enter a integer: ");
		int num = enter.nextInt();
		
		switch (num){
			case 1: a=("ONE");
			break;
			case 2: a=("TWO");
			break;
			case 3: a=("THREE");
			break;
			case 4: a=("FOUR");
			break;
			case 5: a=("FIVE");
			break;
			case 6: a=("SIX");
			break;
			case 7: a=("SEVEN");
			break;
			case 8: a=("EIGHT");
			break;
			case 9: a=("NINE");
			break;
			
			default: a=("OTHER");
		}
		
		System.out.println("The input integer is \"" + a +"\"." );

	}

}
