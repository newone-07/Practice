package practice;
import java.util.Scanner;
public class array {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter how many number you want to store");
		int nofelements = scanner.nextInt();
		int[] array = new int[nofelements];
		int n = nofelements;
		for(i=0; i < n; i++) {
			System.out.println("enter the array elements one by one");
			array[i] = scanner.nextInt();
			
		}
		
	}

}
