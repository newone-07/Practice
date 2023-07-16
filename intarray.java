package practice;
import java.util.Scanner;
public class intarray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	int[] num = new int[10];
	int r=0;
	int sum = 0;
	System.out.println("enter number of elements you want to store ");
	r= scanner.nextInt();
	for(int i = 0; i< r;i++) {
	 num[i]= scanner.nextInt();
	}
	for(int n : num) {
		sum +=n;
	}
	System.out.println(sum);
}
}
