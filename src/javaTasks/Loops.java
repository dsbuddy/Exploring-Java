package javaTasks;

import java.util.Scanner;

public class Loops {


	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		ask();		
	}
	public static void ask() {
		int ans = 0;
		System.out.println("Would you like to use Daniel Schwartz's program?");
		System.out.println("Please answer 1 for yes or 2 for no.");
		ans = reader.nextInt();
		if (ans == 1) {
			int choice = 0;
			System.out.println("Please choose a method");
			System.out.println("1) sumAverage");
			System.out.println("2) sumAverageOdd");
			System.out.println("3) sumDivSeven");
			System.out.println("4) sumAverageSquares");
			System.out.println("5) computePI");
			System.out.println("6) CozaLozaWoza");
			System.out.println("7) fibonacci");
			System.out.println("8) tribonacci");
			System.out.println("9) reverseInt");
			choice = reader.nextInt();
			choose(choice);	
		} else {
			System.out.println("Goodbye");
			System.exit(0);
		}
	}

	public static void choose(int choice) {
		switch (choice) {
		case 1:
			sumAverage(1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 2:
			sumAverage(2);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 3:
			sumAverage(3);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 4:
			sumAverage(4);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 5:
			computePI();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 6:
			cozaLozaWoza();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 7:
			fibonacci(2);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 8:
			fibonacci(3);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		case 9:
			reverseInt();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			ask();
			break;
		default:
			ask();
			break;
		}	
	}
	public static void sumAverage(int inc) {
		double sum = 0;
		int num;
		System.out.println("Please enter an upperbound for the sumAverage method below:");
		num = reader.nextInt();
		 if (num <= 0) {
			 System.out.println("Yo man, put a natural number in!!");
		 } else if (inc == 1 || inc == 2) {
			 System.out.print("Sum = ");
			 for (int i = 1; i < num + 1; i += inc) {
				System.out.print(i);
				sum += i;
				if (inc == 1) {
					if (i == num) {
						System.out.print(" = " + sum);
						System.out.println("");
						System.out.println("Average = " + sum + " / " + i + " = " + (sum/i));
						} else {
						System.out.print(" + ");
						}					
				} else if (inc == 2) {
					if (i % 2 == 1 && i == num) {
						System.out.print(" = " + sum);
						System.out.println("");
						System.out.println("Average = " + sum + " / " + ((i+1)/2) + " = " + (sum/((i+1)/2)));
					} else if (i % 2 == 0 && i == num) {
						System.out.print(" = " + sum);
						System.out.println("");
						System.out.println("Average = " + sum + " / " + (i/2) + " = " + (sum/(i/2)));
					} else {
						System.out.print(" + ");
					}
				}
			 }
		} else if (inc == 3) {
			double sum7 = 0;
			int inc7 = 0;
			String var = "";
			for (int j = 0; j < num + 1; j++) {
				if (j % 7 == 0) {
					var += j;
					if (j % 7 == 0) var += " + ";
					sum7 += j;
					inc7++;
				}
			}
			System.out.println((var.substring(0, var.length()-2)) +  " = " + sum7);
			System.out.println("Sum is: " + sum7);
			System.out.println("Average is: " + sum7/inc7);
		} else if (inc == 4) {
			double sum4 = 0;
			int inc4 = 0;
			String var = "";
			for (int k = 0; k < num + 1; k++) {
				var += (Math.pow(k,2)) + " + ";
				sum4 += Math.pow(k,2);
				inc4++;
			}
			System.out.println((var.substring(6, var.length()-2)) +  " = " + sum4);
			System.out.println("Sum is: " + sum4);
			System.out.println("Average is: " + sum4/(inc4-1));
		}
	}
	public static void computePI() {
		int num;
		double compPI = 0;
		System.out.println("Please enter the termination criterion used in the computation:");
		num = reader.nextInt();
		for (double i = 0; i <= (num*2)+1; i++) {
			if (i%4 == 1) compPI += (1/i);
			else if (i %4 == 3) compPI -= (1/i);
		}
		compPI *=4;
		System.out.println("Your computed PI: " + compPI);
		System.out.println("Percent = |theoretical - experimental| * 100%");
		System.out.println(" Error            theoretical");
		System.out.println("Percent = | " + Math.PI + " - " + compPI + " | * 100%");
		System.out.println(" Error                  " + Math.PI);
		System.out.println("The percent error is: " + ((Math.abs(compPI-Math.PI)/Math.PI)*100) + "%");
		
	}
	public static void cozaLozaWoza() {
		for (int i = 0; i <= 110; i++) {
			if (i % 3 == 0) System.out.print("Coza");
			if (i % 5 == 0) System.out.print("Loza");
			if (i % 7 == 0) System.out.print("Woza");
			if (!(i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) System.out.print(i);
			System.out.print(" ");
			if (i % 11 == 0) System.out.println();
		}
	}
	public static void fibonacci(int var) {
		int num;
		System.out.println("Please enter the termination criterion used in the computation:");
		num = reader.nextInt();
		double sum = 0;
    	int[] fib = new int[num];
    	if (num < 1) return;
    	if (var == 2) {
    		if (num == 1) { 
    			System.out.println("1");
    		} else if (num == 2) {
    			System.out.println("1 1");
    		} else {
		        fib[0] = 1;
	        	fib[1] = 1;
		        for(int i=2; i < num; i++){
	        	    fib[i] = fib[i-1] + fib[i-2];
		        }
    		}
	 	} else if (var == 3) {
	 		if (num == 1) {
	 			System.out.println("0");
	 		} else if (num == 2) {
	 			System.out.println("0 1");
	 		} else if (num == 3) {
	 			System.out.println("0 1 1");
	 		} else {
	        	fib[0] = 0;
		        fib[1] = 1;
			fib[2] = 1;
		        for(int i=3; i < num; i++){
	        	    fib[i] = fib[i-1] + fib[i-2] + fib[i-3];
		        }
	 		}
		}
	        for(int i=0; i< fib.length; i++){
	        	System.out.print(fib[i] + " ");
			sum += fib[i];
	        }
	        System.out.println("");
			System.out.println("Sum = " + sum);
			System.out.println("Average = " + (sum/fib.length));
	}
	public static void reverseInt() {
		int num;
		String var = "";
		System.out.println("Please enter the number to become reverseInt:");
		num = reader.nextInt();		
		while (num > 0) {
			var += ((num % 10) + ",");
			num = num / 10;
		}
		System.out.println(var.substring(0, var.length()-1));
	}
}