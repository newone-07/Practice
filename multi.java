package practice;
import java.util.Scanner;
public class multi {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a positive number");
		num = scanner.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.println(i*num);
		}
	}

}
