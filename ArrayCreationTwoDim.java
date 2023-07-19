package practice;

import java.util.Scanner;

public class ArrayCreationTwoDim {
	public static void main(String[] args) {
		/*Enter the number of elements you want to store 
2
enter the values of array 
36
35
21
24
36 35 
21 24*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store ");
		int size = scanner.nextInt();
		int[][] arr = new int[2][size];
		System.out.println("enter the values of array ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}
}
