package practice;

import java.util.Scanner;
import java.util.Arrays;

public class AverageOfTwodimArray {
	public static void main(String[] args) {
/*Enter the number of rows you want to store 
6
Enter the number of columns you want to store 
2
Enter the values in array
23
25
36
25
25
15
36
14
15
25
25
25
The Sum of two dimensional array is 289
The average of two dimensional array is 36
*/
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int average = 0;
		System.out.println("Enter the number of rows you want to store ");
		int row = scanner.nextInt();
		System.out.println("Enter the number of columns you want to store ");
		int cloumn = scanner.nextInt();
		int[][] arr = new int[row][cloumn];
		System.out.println("Enter the values in array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cloumn; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cloumn; j++) {
				sum = sum + arr[i][j];
				int div = row + cloumn;
				average = sum / div;
			}
		}
		System.out.println("The Sum of two dimensional array is " + sum);
		System.out.println("The average of two dimensional array is " + average);
	}
}
