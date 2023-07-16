package practice;
import java.util.Scanner;
public class ReversePatten {
public static void main(String[] args) {
	/*Enter the number 
7
*******
******
*****
****
***
**
*   */
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the number ");
	int input = scanner.nextInt();
	for(int i =1 ; i<=input;i++) {
		
		for(int j =i;j<=input;j++) {
			System.out.print("*");
		 
		}
		System.out.println("");
	}
}
}
