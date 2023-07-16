package practice;
import java.util.Scanner;
public class SubOfReverseNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number ");
	int input = scanner.nextInt();
	int Input = input;
	int reverse = 0;
	while(input != 0) {
		int remainder = input %10;
		reverse = reverse * 10 + remainder;
		input = input/10;
	}
	int difference = 0;
	difference = Input - reverse;
	System.out.println("the difference between the given number and its reverse is ");
	System.out.println(difference);
}
}
