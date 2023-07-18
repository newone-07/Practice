package practice;

import java.util.Scanner;

public class SumOfArray {
	/*Enter the number of elements you want to store 
4
Enter the elements one by one 
8
5
9
3
the Sum of Array is 25
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store ");
		int elementsno = scanner.nextInt();
		int sum = 0;
		int[] arr = new int[elementsno];
		System.out.println("Enter the elements one by one ");
		for (int i = 0; i < elementsno; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int value : arr) {
			sum = sum + value;
		}
		System.out.println("the Sum of Array is " + sum);
	}
}
