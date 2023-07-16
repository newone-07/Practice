package practice;
import java.util.Scanner;
public class sort {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num;
	System.out.println("Enter the number to get multiplication and subtraction table ");
	num = scanner.nextInt();
	System.out.println("multiplication table ");
	for(int i=1; i<=10;i++) {
		System.out.println(i*num);
	}
	System.out.println("Subtraction  table ");
	for(int i=1; i<=20;i++) {
		System.out.println(i-num);
	}		
	}
}
