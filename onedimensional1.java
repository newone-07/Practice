package practice;
import java.util.Scanner;
public class onedimensional1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int arr[] = new int[24];
	System.out.println("how many number you want to store ");
	int no= scanner.nextInt();
	System.out.println("Enter the elements of array ");
	for(int i = 0; i < no; i++) {
		arr[i]=scanner.nextInt();
	}
	for(int e:arr) {
		System.out.println("the elements in array are...");
		System.out.println(e);
	}
}
}
