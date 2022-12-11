package practiseProblemsDay6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num = sc.nextInt();
		int rem = 0, result = 0;

		while (num !=0 ) {
			rem = num % 10;
			result = result * 10 + rem;
			num = num / 10;
		}
		System.out.println("The Reversed Number :" + result);

	}

}
