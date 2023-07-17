package practice;

import java.util.Scanner;

public class AreaOfSquare {
	/*Enter the number to find area of square 
4
Area ofSquare is 16
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find area of square ");
		int input = scanner.nextInt();
		int result = input * input;
		System.out.println("Area ofSquare is " + result);
	}
}
