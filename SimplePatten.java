package practice;
import java.util.Scanner;
public class SimplePatten {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int input = scanner.nextInt();
		for(int i = 1;i<=input;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}	
			System.out.println("");
		}
	}

}
