package practiseProblemsDay6;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
		double startTime, stopTime;
		System.out.println("Enter 1 to Start : ");
		Scanner sc = new Scanner(System.in);
		
		startTime =  sc.nextDouble();
		startTime = System.currentTimeMillis();
		
		System.out.println("Enter 2 To Stop :");
		stopTime = sc.nextDouble();
		stopTime = System.currentTimeMillis();
		
		double timeElapsed = (stopTime - startTime) ;
		System.out.println("Total time Elapsed in milliseconds: " + timeElapsed);
		
        double secs = (timeElapsed / 1000 ) ;
        double minutes = (secs / 60);
        System.out.println( " Seconds : "+secs);
        System.out.println(" The Time in minutes :" + minutes);
        
	}

}
