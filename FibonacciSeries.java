package practiseProblemsDay6;

import java.util.Scanner;

public class FibonacciSeries {
	static void fibonacci(int num){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
        int  firstnum=0, secondnum=0, nextnum = 1;
        for(int i = 1; i <= num; i++){ 
        	
              firstnum = secondnum;
              secondnum = nextnum;
              nextnum = firstnum + secondnum;
              System.out.print(firstnum + " ");
        }
  }     


	public static void main(String[] args) {
		
		FibonacciSeries fib = new FibonacciSeries();
		fib.fibonacci(1);
		
	}

}
