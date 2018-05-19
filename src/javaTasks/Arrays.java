package javaTasks;
import java.util.Scanner;

public class Arrays {
	


	
	private static boolean again = true;
	
	public static void main(String[] args) {
		ask();
			
			
			
	}
	
	public static void ask() {
		Scanner input = new Scanner(System.in);
		System.out.println("If you would like to create your own array and test the methods, enter yes: ");
		System.out.println("Else, it runs a sample code");
		String line = input.nextLine();
		
		if (line.toUpperCase().equals("YES")) {
			System.out.println("What method would you like to test?");
			System.out.println("1) evenInt" +"\t\t"+ " 6) sameEnds");
			System.out.println("2) biggestDiff" +"\t\t"+ " 7) tripleUp");
			System.out.println("3) lucky13" +"\t\t"+ " 8) shiftLeft");
			System.out.println("4) modThree" +"\t\t"+ " 9) evenOdd");
			System.out.println("5) haveThree" +"\t\t"+ "10) fizzBuzz");
			
		} else {
		int[] evenInt1 = {2, 1, 2, 3, 4};   
		int[] evenInt2 = {2, 2, 0};	    
		int[] evenInt3 = {1, 3, 5};    
		int[] evenInt4 = {};    
		int[] evenInt5 = {11, 9, 0, 1};    
		int[] evenInt6 = {2, 11, 9, 0};	    
		int[] evenInt7 = {2};     
		int[] evenInt8 = {2, 5, 12}; 
		
		System.out.println("Testing evenInt()");
		System.out.println("Expected Output: ");
		System.out.println("3, 3, 0, 0, 1, 2, 1, 2");
		System.out.println("Actual Output: ");
		System.out.print(evenInt(evenInt1) + ", ");
		System.out.print(evenInt(evenInt2) + ", ");
		System.out.print(evenInt(evenInt3) + ", ");
		System.out.print(evenInt(evenInt4) + ", ");
		System.out.print(evenInt(evenInt5) + ", ");
		System.out.print(evenInt(evenInt6) + ", ");
		System.out.print(evenInt(evenInt7) + ", ");
		System.out.println(evenInt(evenInt8));
		
		
		System.out.println("\n\n\n");
		
	//Test biggestDiff
		int[] bigDiff1 = {10, 3, 5, 6};	    
		int[] bigDiff2 = {7, 2, 10, 9};	    
		int[] bigDiff3 = {2, 10, 7, 2};	    
		int[] bigDiff4 = {2, 10};	    
		int[] bigDiff5 = {10, 2};	    
		int[] bigDiff6 = {10, 0};	    
		int[] bigDiff7 = {2, 3};	    
		int[] bigDiff8 = {2, 2};	    
		int[] bigDiff9 = {2};	    
		int[] bigDiff10 = {5, 1, 6, 1, 9, 9};	    
		int[] bigDiff11 = {7, 6, 8, 5};	    
		int[] bigDiff12 = {7, 7, 6, 8, 5, 5, 6};
		
		System.out.println("Testing biggestDiff()");
		System.out.println("Expected Output: ");
		System.out.println("7, 8, 8, 8, 8, 10, 1, 0, 0, 8, 3, 3");
		System.out.println("Actual Output: ");
		System.out.print(biggestDiff(bigDiff1) + ", ");
		System.out.print(biggestDiff(bigDiff2) + ", ");
		System.out.print(biggestDiff(bigDiff3) + ", ");
		System.out.print(biggestDiff(bigDiff4) + ", ");
		System.out.print(biggestDiff(bigDiff5) + ", ");
		System.out.print(biggestDiff(bigDiff6) + ", ");
		System.out.print(biggestDiff(bigDiff7) + ", ");
		System.out.print(biggestDiff(bigDiff8) + ", ");
		System.out.print(biggestDiff(bigDiff9) + ", ");
		System.out.print(biggestDiff(bigDiff10) + ", ");
		System.out.print(biggestDiff(bigDiff11) + ", ");
		System.out.println(biggestDiff(bigDiff12));
		
		System.out.println("\n\n\n");
		
	//Test lucky13
		int[] lucky131 = {0, 2, 4};	    
		int[] lucky132 = {1, 2, 3};	    
		int[] lucky133 = {1, 2, 4};	    
		int[] lucky134 = {2, 7, 2, 8};	    
		int[] lucky135 = {2, 7, 1, 8};	    
		int[] lucky136 = {3, 7, 2, 8};	    
		int[] lucky137 = {2, 7, 2, 1};	    
		int[] lucky138 = {1, 2};	    
		int[] lucky139 = {2, 2};	    
		int[] lucky1310 = {2};	    
		int[] lucky1311 = {3};	    
		int[] lucky1312 = {}; 
		
		System.out.println("Testing lucky13()");
		System.out.println("Expected Output: ");
		System.out.println("true, false, false, true, false, false, false, false, true, true, false, true");
		System.out.println("Actual Output: ");
		System.out.print(lucky13(lucky131) + ", ");
		System.out.print(lucky13(lucky132) + ", ");
		System.out.print(lucky13(lucky133) + ", ");
		System.out.print(lucky13(lucky134) + ", ");
		System.out.print(lucky13(lucky135) + ", ");
		System.out.print(lucky13(lucky136) + ", ");
		System.out.print(lucky13(lucky137) + ", ");
		System.out.print(lucky13(lucky138) + ", ");
		System.out.print(lucky13(lucky139) + ", ");
		System.out.print(lucky13(lucky1310) + ", ");
		System.out.print(lucky13(lucky1311) + ", ");
		System.out.println(lucky13(lucky1312));
		
		System.out.println("\n\n\n");
		
	//Test modThree
		int[] modThree1 = {2, 1, 3, 5};	    
		int[] modThree2 = {2, 1, 2, 5};	    
		int[] modThree3 = {2, 4, 2, 5};	    
		int[] modThree4 = {1, 2, 1, 2, 1};	    
		int[] modThree5 = {9, 9, 9};	    
		int[] modThree6 = {1, 2, 1};	    
		int[] modThree7 = {1, 2};	    
		int[] modThree8 = {1};	    
		int[] modThree9 = {};	    
		int[] modThree10 = {9, 7, 2, 9};	    
		int[] modThree11 = {9, 7, 2, 9, 2, 2};	    
		int[] modThree12 = {9, 7, 2, 9, 2, 2, 6};
		
		System.out.println("Testing modThree()");
		System.out.println("Expected Output: ");
		System.out.println("true, false, true, false, true, false, false ,false, false, false, false, true");
		System.out.println("Actual Output: ");
		System.out.print(modThree(modThree1) + ", ");
		System.out.print(modThree(modThree2) + ", ");
		System.out.print(modThree(modThree3) + ", ");
		System.out.print(modThree(modThree4) + ", ");
		System.out.print(modThree(modThree5) + ", ");
		System.out.print(modThree(modThree6) + ", ");
		System.out.print(modThree(modThree7) + ", ");
		System.out.print(modThree(modThree8) + ", ");
		System.out.print(modThree(modThree9) + ", ");
		System.out.print(modThree(modThree10) + ", ");
		System.out.print(modThree(modThree11) + ", ");
		System.out.println(modThree(modThree12));
		
		System.out.println("\n\n\n");
		
	//Test haveThree
		int[] haveThree1 = {3, 1, 3, 1, 3};	    
		int[] haveThree2 = {3, 1, 3, 3};	    
		int[] haveThree3 = {3, 4, 3, 3, 4};	    
		int[] haveThree4 = {1, 3, 1, 3, 1, 2};	    
		int[] haveThree5 = {1, 3, 1, 3, 1, 3};	    
		int[] haveThree6 = {1, 3, 3, 1, 3};	    
		int[] haveThree7 = {1, 3, 1, 3, 1, 3, 4, 3};	    
		int[] haveThree8 = {3, 4, 3, 4, 3, 4, 4};	    
		int[] haveThree9 = {3, 3, 3};	    
		int[] haveThree10 = {1, 3};	    
		int[] haveThree11 = {3};	    
		int[] haveThree12 = {1};
		
		System.out.println("Testing haveThree()");
		System.out.println("Expected Output: ");
		System.out.println("true, false, false, false, true, false, false, true, false, false, false, false");
		System.out.println("Actual Output: ");
		System.out.print(haveThree(haveThree1) + ", ");
		System.out.print(haveThree(haveThree2) + ", ");
		System.out.print(haveThree(haveThree3) + ", ");
		System.out.print(haveThree(haveThree4) + ", ");
		System.out.print(haveThree(haveThree5) + ", ");
		System.out.print(haveThree(haveThree6) + ", ");
		System.out.print(haveThree(haveThree7) + ", ");
		System.out.print(haveThree(haveThree8) + ", ");
		System.out.print(haveThree(haveThree9) + ", ");
		System.out.print(haveThree(haveThree10) + ", ");
		System.out.print(haveThree(haveThree11) + ", ");
		System.out.println(haveThree(haveThree12) + ", ");
		
		System.out.println("\n\n\n");
		
	//Test sameEnds
		int[] sameEnds1 = {5, 6, 45, 99, 13, 5, 6};
		int n1 = 1;	    
		int[] sameEnds2 = {5, 6, 45, 99, 13, 5, 6};
		int n2 = 2; 	    
		int[] sameEnds3 = {5, 6, 45, 99, 13, 5, 6};
		int n3 = 3; 	    
		int[] sameEnds4 = {1, 2, 5, 2, 1};
		int n4 = 1;    
		int[] sameEnds5 = {1, 2, 5, 2, 1};
		int n5 = 2;	    
		int[] sameEnds6 = {1, 2, 5, 2, 1};
		int n6 = 0; 	    
		int[] sameEnds7 = {1, 2, 5, 2, 1};
		int n7 = 5; 	    
		int[] sameEnds8 = {1, 1, 1};
		int n8 = 0; 	    
		int[] sameEnds9 = {1, 1, 1};
		int n9 = 1;	    
		int[] sameEnds10 = {1, 1, 1};
		int n10 = 2; 	    
		int[] sameEnds11 = {1, 1, 1};
		int n11 = 3;	    
		int[] sameEnds12 = {1};
		int n12 = 1; 	    
		int[] sameEnds13 = {};
		int n13 = 0; 	    
		int[] sameEnds14 = {4, 2, 4, 5};
		int n14 = 1;
		
		System.out.println("Testing sameEnds()");
		System.out.println("Expected Output: ");
		System.out.println("false, true, false, true, false, true, true, true, true, true, true, true, true, false");
		System.out.println("Actual Output: ");
		System.out.print(sameEnds(sameEnds1, n1) + ", ");
		System.out.print(sameEnds(sameEnds2, n2) + ", ");
		System.out.print(sameEnds(sameEnds3, n3) + ", ");
		System.out.print(sameEnds(sameEnds4, n4) + ", ");
		System.out.print(sameEnds(sameEnds5, n5) + ", ");
		System.out.print(sameEnds(sameEnds6, n6) + ", ");
		System.out.print(sameEnds(sameEnds7, n7) + ", ");
		System.out.print(sameEnds(sameEnds8, n8) + ", ");
		System.out.print(sameEnds(sameEnds9, n9) + ", ");
		System.out.print(sameEnds(sameEnds10, n10) + ", ");
		System.out.print(sameEnds(sameEnds11, n11) + ", ");
		System.out.print(sameEnds(sameEnds12, n12) + ", ");
		System.out.print(sameEnds(sameEnds13, n13) + ", ");
		System.out.println(sameEnds(sameEnds14, n14) + ", ");
		
		System.out.println("\n\n\n");
		
	//Test tripleUp
		int[] tripleUp1 = {1, 4, 5, 6, 2};	    
		int[] tripleUp2 = {1, 2, 3};	    
		int[] tripleUp3 = {1, 2, 4};	    
		int[] tripleUp4 = {1, 2, 4, 5, 7, 6, 5, 6, 7, 6};	    
		int[] tripleUp5 = {1, 2, 4, 5, 7, 6, 5, 7, 7, 6};	    
		int[] tripleUp6 = {1, 2};	    
		int[] tripleUp7 = {1};	    
		int[] tripleUp8 = {};	    
		int[] tripleUp9 = {10, 9, 8, -100, -99, -98, 100};	    
		int[] tripleUp10 = {10, 9, 8, -100, -99, 99, 100};	    
		int[] tripleUp11= {-100, -99, -99, 100, 101, 102};	    
		int[] tripleUp12 = {2, 3, 5, 6, 8, 9, 2, 3};
		
		System.out.println("Testing tripleUp()");
		System.out.println("Expected Output: ");
		System.out.println("true, true, true, true, true, false, false, false, true, true, true, true");
		System.out.println("Actual Output: ");
		System.out.print(tripleUp(tripleUp1) + ", ");
		System.out.print(tripleUp(tripleUp2) + ", ");
		System.out.print(tripleUp(tripleUp3) + ", ");
		System.out.print(tripleUp(tripleUp4) + ", ");
		System.out.print(tripleUp(tripleUp5) + ", ");
		System.out.print(tripleUp(tripleUp6) + ", ");
		System.out.print(tripleUp(tripleUp7) + ", ");
		System.out.print(tripleUp(tripleUp8) + ", ");
		System.out.print(tripleUp(tripleUp9) + ", ");
		System.out.print(tripleUp(tripleUp10) + ", ");
		System.out.print(tripleUp(tripleUp11) + ", ");
		System.out.println(tripleUp(tripleUp12));
		
		System.out.println("\n\n\n");
		
	//Test shiftLeft
		int[] shiftLeft1 = {6, 2, 5, 3};	    
		int[] shiftLeft2 = {1, 2};	    
		int[] shiftLeft3 = {1};	    
		int[] shiftLeft4 = {};	    
		int[] shiftLeft5 = {1, 1, 2, 2, 4};    
		int[] shiftLeft6 = {1, 1, 1};	    
		int[] shiftLeft7 = {1, 2, 3};
		
		int[] shifted1 = shiftLeft(shiftLeft1);
		int[] shifted2 = shiftLeft(shiftLeft2);
		int[] shifted3 = shiftLeft(shiftLeft3);
		int[] shifted4 = shiftLeft(shiftLeft4);
		int[] shifted5 = shiftLeft(shiftLeft5);
		int[] shifted6 = shiftLeft(shiftLeft6);
		int[] shifted7 = shiftLeft(shiftLeft7);
		
		System.out.println("Testing shiftLeft()");
		System.out.println("Expected Output: ");
		System.out.println("{2, 5, 3, 6}");
		System.out.println("{2, 1}");
		System.out.println("{1}");
		System.out.println("{}");
		System.out.println("{1, 2, 2, 4, 1}");
		System.out.println("{1, 1, 1}");
		System.out.println("{2, 3, 1}");
		System.out.println("Actual Output: ");
		for (int i : shifted1) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : shifted2) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : shifted3) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : shifted4) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : shifted5) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : shifted6) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : shifted7) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		
		System.out.println("\n\n\n");
		
	//Test evenOdd
		int[] evenOdd1 = {1, 0, 1, 0, 0, 1, 1};	    
		int[] evenOdd2 = {3, 3, 2};	    
		int[] evenOdd3 = {2, 2, 2};	    
		int[] evenOdd4 = {3, 2, 2};	    
		int[] evenOdd5 = {1, 1, 0, 1, 0};	    
		int[] evenOdd6 = {1};	    
		int[] evenOdd7 = {1, 2};	    
		int[] evenOdd8 = {2, 1};	    
		int[] evenOdd9 = {};
		
		int[] split1 = evenOdd(evenOdd1);
		int[] split2 = evenOdd(evenOdd2);
		int[] split3 = evenOdd(evenOdd3);
		int[] split4 = evenOdd(evenOdd4);
		int[] split5 = evenOdd(evenOdd5);
		int[] split6 = evenOdd(evenOdd6);
		int[] split7 = evenOdd(evenOdd7);
		int[] split8 = evenOdd(evenOdd8);
		int[] split9 = evenOdd(evenOdd9);
		
		System.out.println("Testing evenOdd()");
		System.out.println("Expected Output: ");
		System.out.println("{0, 0, 0, 1, 1, 1, 1}");
		System.out.println("{2, 3, 3}");
		System.out.println("{2, 2, 2}");
		System.out.println("{2, 2, 3}");
		System.out.println("{0, 0, 1, 1, 1}");
		System.out.println("{1}");
		System.out.println("{2, 1}");
		System.out.println("{2, 1}");
		System.out.println("Actual Output: ");
		for (int i : split1) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split2) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split3) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split4) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split5) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split6) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split7) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split8) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i : split9) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\n\n");
		
	//Test fizzBuzz
		int f1 = 1, b1 = 6;
		int f2 = 1, b2 = 8;
		int f3 = 1, b3 = 11;
		int f4 = 1, b4 = 16;
		int f5 = 1, b5 = 4;
		int f6 = 1, b6 = 2;
		int f7 = 50, b7 = 56;
		int f8 = 15, b8 = 17;
		int f9 = 30, b9 = 36;
		int f10 = 1000, b10 = 1006;
		int f11 = 99, b11 = 102;
		int f12 = 14, b12 = 20;
			    
		String[] fb1 = fizzBuzz(f1, b1);
		String[] fb2 = fizzBuzz(f2, b2);
		String[] fb3 = fizzBuzz(f3, b3);
		String[] fb4 = fizzBuzz(f4, b4);
		String[] fb5 = fizzBuzz(f5, b5);
		String[] fb6 = fizzBuzz(f6, b6);
		String[] fb7 = fizzBuzz(f7, b7);
		String[] fb8 = fizzBuzz(f8, b8);
		String[] fb9 = fizzBuzz(f9, b9);
		String[] fb10 = fizzBuzz(f10, b10);
		String[] fb11 = fizzBuzz(f11, b11);
		String[] fb12 = fizzBuzz(f12, b12);
	
		System.out.println("Testing fizzBuzz()");
		System.out.println("Expected Output: ");
		System.out.println("{1, 2, Fizz, 4, Buzz}");
		System.out.println("{1, 2, Fizz, 4, Buzz, Fizz, 7}");
		System.out.println("{1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz}");
		System.out.println("{1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz}");
		System.out.println("{1, 2, Fizz}");
		System.out.println("{1}");
		System.out.println("{Buzz, Fizz, 52, 53, Fizz, Buzz}");
		System.out.println("{FizzBuzz, 16}");
		System.out.println("{FizzBuzz, 31, 32, Fizz, 34, Buzz}");
		System.out.println("{Buzz, 1001, Fizz, 1003, 1004, FizzBuzz}");
		System.out.println("{Fizz, Buzz, 101}");
		System.out.println("{14 FizzBuzz, 16, 17, Fizz, 19}");
		System.out.println("Actual Output: ");
		for (String string : fb1) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb2) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb3) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb4) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb5) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb6) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb7) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb8) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb9) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb10) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb11) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		for (String string : fb12) {
			System.out.print(string + ", ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		ask();
		}
		int choose = input.nextInt();
		int[] nums = createArray();
		cyo(choose, nums);	
		
	}
	
	
	public static void cyo(int choose, int[] nums) {
		System.out.println(choose);
		if (choose == 1) {
			System.out.println(evenInt(nums));
		} else if (choose == 2) {
			System.out.println(biggestDiff(nums));
		} else if (choose == 3) {
			System.out.println(lucky13(nums));
		} else if (choose == 4) {
			System.out.println(modThree(nums));
		} else if (choose == 5) {
			System.out.println(haveThree(nums));
		} else if (choose == 6) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter how many numbers you would like checked: ");
			int line = input.nextInt();
			System.out.println(sameEnds(nums, line));
		} else if (choose == 7) {
			System.out.println(tripleUp(nums));
		} else if (choose == 8) {
			int[] shifted1 = shiftLeft(nums);
			for (int i : shifted1) {
				System.out.print(i + ", ");
			}
		} else if (choose == 9) {
			int[] split1 = evenOdd(nums);
			for (int i : split1) {
				System.out.print(i + ", ");
			}
		} else if (choose == 10) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the start for fizzBuzz: ");
			int s = input.nextInt();
			System.out.print("Please enter the end for fizzBuzz: ");
			int e = input.nextInt();
			String[] fb1 =fizzBuzz(s, e);
			for (String string : fb1) {
			System.out.print(string + ", ");
			}
		} else {
			System.out.println("You did not enter a valid option, try again.");
			cyo(choose, nums);
		}
		

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		ask();
		
		}
	
	
	public static int[] createArray() {
		Scanner input = new Scanner(System.in); 

		System.out.println("Please enter integers to the right (seperated by spaces): ");
		String line = input.nextLine();
		
		String[] numbers = line.split("\\s+");
		
		int[] numResult = new int[numbers.length-1];
		for (int i = 0; i < numbers.length - 1; i++) {
			numResult[i] = Integer.parseInt(numbers[i]);
		}
		
		return numResult;
	}

//      		Moore Test
//		//		//Test evenInt

				
//	}
	
	public static int evenInt(int[] nums) {
		int count = 0;
		
		for (int i : nums) {
			if (i % 2 == 0) count++;
		}
		return count;
	}
	
	public static int biggestDiff(int[] nums) {
		int diff = 0, min = nums[0], max = nums[0];
		
		for (int i : nums) {
			if (i < min) min = i;
			if (i > max) max = i;
		}
		
		diff = max - min;
		return diff;
	}
	
	public static boolean lucky13(int[] nums) {
		for (int i : nums) {
			if ((i == 1) || (i == 3)) return false;
		}
		return true;
	}
	
	public static boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] % 2 == 0)) {
				if (((nums[i+1]) % 2 == 0) && ((nums[i+2]) % 2 == 0)) {
					return true;
				}
			} else if ((nums[i] % 2 == 1)) {
				if (((nums[i+1]) % 2 == 1) && ((nums[i+2]) % 2 == 1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean haveThree(int[] nums) {
		int count = 0;
		if (nums[nums.length-1] == 3) {
			count ++;
		}
		
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] == 3) && ((nums[i+1]) != 3)) {
				count++;
			}
		}
		if (count == 3) {
			return true;
		}
		return false;
	}
	
	public static boolean sameEnds(int[] nums, int n) {
		if (n == 0) {
			return true;
		}

		for (int i=0; i < n ; i++) {
			if (nums[i] != nums[(nums.length) - n + i]) {
				return false;
			}
		}

		return true;
	}
	
	public static Boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++){
			if (nums[i] >= (nums[i + 1] - 1) && nums[i + 1] >= (nums[i + 1] - 1)){
				return true;
			}
		}

		return false;
	}

	public static int[] shiftLeft(int[] nums) {
		if (nums.length == 0) return nums;

		int temp = nums[0];

		for (int i = 0; i < nums.length-1; i++) {
			nums[i] = nums[i+1];
		}

		nums[nums.length-1] = temp;

		return nums;
	}

	public static int[] evenOdd(int[] nums) {
		int[] numResult = new int[nums.length];
		int c = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				numResult[c] = (nums[i]);
				c++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] % 2 == 1) {
				numResult[c] = (nums[j]);
				c++;
			}
			
		}
		
		return numResult;
	}

	public static String[] fizzBuzz(int start, int end) {
		String[] numResult = new String[end-start];
		
	    for(int i = start; i < end; i++) {
	    	if (i % 15 == 0) {
	    		numResult[i - start] = "FizzBuzz";
	    	} else if (i % 3 == 0) {
	    		numResult[i - start] = "Fizz";
	    	} else if (i % 5 == 0) {
	    		numResult[i - start] = "Buzz";
	    	} else {
	    		numResult[i - start] = String.valueOf(i);
	    	}
	    }
	                                                      
	    return numResult;
    }
	
}