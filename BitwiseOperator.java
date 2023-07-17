package practice;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
		/*Enter the first value 
		69
		Enter the second value 
		65
		result of bitwise and operator is 65
		result of bitwise or operator is 1
		result of XOR operator is 4
		result of ~ complement is -70*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value ");
		int input = scanner.nextInt();
		System.out.println("Enter the second value ");
		int input1 = scanner.nextInt();
		// bitwise & operator
		int bitandop = input & input1;
		System.out.println("result of bitwise and operator is " + bitandop);
		// bitwise / operator
		int bitorop = input / input1;
		System.out.println("result of bitwise or operator is " + bitorop);
		// bitwise xor operator
		int bitxorop = input ^ input1;
		System.out.println("result of XOR operator is " + bitxorop);
		// bitwise complement operator ~n = -(n+1)
		int bitcomplement = ~input;
		System.out.println("result of ~ complement is " + bitcomplement);
	}
}
