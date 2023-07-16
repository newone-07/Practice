package practice;
import java.util.Scanner;
public class SimplePattern3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a character ");
	char input = scanner.next().charAt(0);
	for(char i = input; i>='A';i--) {
		for(char j=i;j>='A';j--) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}
