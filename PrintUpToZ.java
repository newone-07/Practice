package practice;

import java.util.Scanner;
public class PrintUpToZ {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any character ");
	char input = scanner.next().charAt(0);
	if(input >= 'a') {
	input =(char)(input - 32);
	}
	for(char i = input; i <= 'Z';i++) {
		System.out.print(i);
	}
}
}
