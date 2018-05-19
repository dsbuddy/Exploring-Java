package javaTasks;

import java.util.Scanner;

public class SelectCase {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int number = 7;
		int choice;
		
		System.out.println("Pick a method 1-3.");
		System.out.println("1) CheckPassFail");
		System.out.println("2) CheckOddEven");
		System.out.println("3) PrintNumberInWord");
		
		choice = reader.nextInt();
		
		choose(choice);

		
		
	}
	public static void choose(int choice) {
		System.out.println(choice);
	
	switch (choice) {
		case 1:
			System.out.println("You chose: CheckPassFail");
			System.out.println("Please enter the grade:");
			int grade = reader.nextInt();
			CheckPassFail(grade);
			break;
		case 2:
			System.out.println("You chose: CheckOddEven");
			System.out.println("Please enter the number:");
			int number = reader.nextInt();
			CheckOddEven(number);
			break;
		case 3:
			System.out.println("You chose: PrintNumberInWord");
			System.out.println("Please enter the number:");
			int num = reader.nextInt();
			PrintNumberInWord(num);
			break;			
		default:
			System.out.println("You did not choose a method.  Please try again.");
			break;
		}

	}
	public static void CheckPassFail(int grade) {
		if (grade > 59) {
			System.out.println("PASS");
		} else {			
			System.out.println("FAIL");
		}
	}
	public static void CheckOddEven(int number) {
		if (number % 2 == 1) {
			System.out.println("Odd Number");
		} else {
			System.out.println("Even Number");
		}
	}
	public static void PrintNumberInWord(int num) {
		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}
}
