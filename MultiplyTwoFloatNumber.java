package practice;
import java.util.Scanner;
public class MultiplyTwoFloatNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double Result = 0;
	System.out.println("Enter the floating number");
	double input1 = scanner.nextDouble();
	System.out.println("Enter the Floating number");
	double input2 = scanner.nextDouble();
	Result = input1 * input2;
	System.out.println("the Result is ");
	System.out.println(Result);
	
	
}
}
