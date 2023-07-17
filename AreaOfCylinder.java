package practice;

import java.util.Scanner;

public class AreaOfCylinder {
	/*Enter the radius 
12
Enter the Height 
98
Area of cylinder is 8289.6*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius ");
		int radius = scanner.nextInt();
		System.out.println("Enter the Height ");
		int height = scanner.nextInt();
		double pi = 3.14;
		double result = (2 * pi * radius * height) + (2 * pi * radius * radius);
		System.out.println("Area of cylinder is " + result);
	}
}
