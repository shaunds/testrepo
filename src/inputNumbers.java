import java.util.Scanner;

public class inputNumbers {

	public static void main(String[] args) {
		// Get input from keyboard
		
		Scanner s = new Scanner(System.in);
		System.out.print("Please input a number: "); // println creates new line whereas print doesn't
		int input = s.nextInt(); //takes in input
		
		//1)Check if number is positive or negative
		
		if(input>0) {
			System.out.println("Positive Number");
		}
		else if(input==0) {
			System.out.println("Number is 0");
		}
		else {
			System.out.println("Negative Number");
		}
		//2)Check if number is odd or even
			
		if(input%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		//change
		}

	}

}
