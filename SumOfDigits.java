package practice;
import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number ");
	int input = scanner.nextInt();
	int sum = 0;
	while(input != 0) {
		int remainder = input % 10;
		sum +=remainder;
		input=input/10;
	}
	System.out.println("The Sum of the digits is ");
	System.out.print(sum);
	
	
}
}
