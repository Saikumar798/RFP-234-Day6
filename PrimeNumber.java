package practiseProblemsDay6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :") ;
		int num, count = 0;
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {

				count++;
			}
		}
		if (count == 2)
			System.out.println(num + "is a Prime Number");
		else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}
