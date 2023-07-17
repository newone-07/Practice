package practice;

import java.util.Scanner;

public class AreaOfRectangle {
	/*Enter the width 
24
Enter the length 
56
Area Of Rectangle is 1344
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width ");
		int width = scanner.nextInt();
		System.out.println("Enter the length ");
		int length = scanner.nextInt();
		int result = width * length;
		System.out.println("Area Of Rectangle is " + result);
	}
}
