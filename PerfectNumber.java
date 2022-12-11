package practiseProblemsDay6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int num, sum = 0;
		num = sc.nextInt();
		
		for (int i = 1; i < num; i++)
		{
			if (num % i == 0)
				sum = sum + i;
		}

		if (sum == num)
			System.out.println(num + " Is a perfect number");
		else
			System.out.println(num + " Is not a perfect number");

	}

}
