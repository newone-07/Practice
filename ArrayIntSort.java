package practice;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayIntSort {
public static void main(String[] args) {
	/*Enter the no of elements you want to store 
3
99
87
54
54
87
99
*/
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the no of elements you want to store ");
	int count = scanner.nextInt();
	int[] arr = new int[count];
	for(int i=0;i<count;i++) {
		arr[i]=scanner.nextInt();
	}
	Arrays.sort(arr);
	for(int value:arr) {
		System.out.println(value);
	}
}
}
