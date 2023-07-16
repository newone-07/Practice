package practice;
import java.util.Scanner;
public class greaterarray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] arr=new int[10];
	System.out.println("Enter how many value you want to store? ");
	int num = scanner.nextInt();
	System.out.println("Enter the elements of array");
	for(int i=0;i <= num; i++) {
		arr[i]= scanner.nextInt();
		}
	int s = arr[0];
	for(int i = 0; i <= arr.length;i++) {
		if(s<arr[i]) {
			s = arr[i];
		}
	}
	System.out.println("the greater number is ");
	System.out.print(s);
}
}
