package practice;
import java.util.Scanner;
public class reverseOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a  number ");
		int input = scanner.nextInt();
		int reverse = 0;
		while(input != 0) {
			int remainder = input % 10;
			reverse = reverse * 10+ remainder;
			input = input/10;
		}
	  System.out.println("The reverse of the number is "+ reverse);
	  
	}

}
