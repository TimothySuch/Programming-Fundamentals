import java.util.*;


/*
 * Timothy Suchomel
 * CPSC-21000-LT1 Programming Fundamentals
 * Fall 2018
 * Project 1
 */


public class Cipher {

	public static void main(String[] args) {
		
		// Preface print information
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Timothy Suchomel");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();
		
		
		// Setting up variables
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randKey = rand.nextInt(10);
		int num1, num2, num3, num4, num5, total;
		int tens, ones, encrypted;
		
		
		// Gathering numbers for total
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");
		System.out.print("1st number: ");
		num1 = scan.nextInt();
		if (num1 >= 20) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("2nd number: ");
		num2 = scan.nextInt();
		if (num2 >= 20) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("3rd number: ");
		num3 = scan.nextInt();
		if (num3 >= 20) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("4th number: ");
		num4 = scan.nextInt();
		if (num4 >= 20) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("5th number: ");
		num5 = scan.nextInt();
		if (num5 >= 20) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}		
		
		
		// Calculating total
		total = num1 + num2 + num3 + num4+ num5;
		
		// Processing Caesar encryption
		tens = total / 10;
		ones = total % 10;
		tens = (tens + randKey) % 10;
		ones = (ones + randKey) % 10;
		
		encrypted = (tens * 10) + ones;
		
		
		System.out.println();
		System.out.println("Total = " +total);
		System.out.println("Your random key is " +randKey);
		System.out.println("Your encoded number is " +encrypted);
		
		
		scan.close();
	}

}
