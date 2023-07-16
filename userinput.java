package practice;

import java.util.Scanner;

public class userinput {
	public static void main(String args[]) {
		Scanner sp = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sp.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Enter your age: ");
		int age = sp.nextInt();
		System.out.println("You're age is " + age);
		System.out.println("Enter your percentage: ");
		double percentage = sp.nextDouble();
		System.out.println("YOU'RE percentage is : " + percentage);
	}
}
