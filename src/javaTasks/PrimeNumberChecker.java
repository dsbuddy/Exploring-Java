package javaTasks;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	
		System.out.println("Please enter your name:");
		String name = reader.nextLine();
				
		System.out.println(name + ", please type your integer to test below:");
		int num = reader.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				System.out.println(num + " is not a prime number");
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(num + " is a prime number");
		}
	}
}
