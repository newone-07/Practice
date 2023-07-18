package practice;
import java.util.Scanner;
public class ArrayCreation {
	public static void main(String args[]) {
		/*Enter how many number you want to store
3
enter the array elements one by one
2
enter the array elements one by one
5
enter the array elements one by one
6
2,5,6,*/
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter how many number you want to store");
		int nofelements = scanner.nextInt();
		int[] array = new int[nofelements];
		int n = nofelements;
		for(int i=0; i < n; i++) {
			System.out.println("enter the array elements one by one");
			array[i] = scanner.nextInt();
			
		}
		for(int number:array) {
			System.out.print(number+"," );
		}
		
	}

}
