package practice;
import java.util.Scanner;
public class StringPattern {
public static void main(String[] args) {
	/*Enter the character 
T
T
TS
TSR
TSRQ
TSRQP
TSRQPO
TSRQPON
TSRQPONM
TSRQPONML
TSRQPONMLK
TSRQPONMLKJ
TSRQPONMLKJI
TSRQPONMLKJIH
TSRQPONMLKJIHG
TSRQPONMLKJIHGF
TSRQPONMLKJIHGFE
TSRQPONMLKJIHGFED
TSRQPONMLKJIHGFEDC
TSRQPONMLKJIHGFEDCB
TSRQPONMLKJIHGFEDCBA
*/
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the character ");
	char input = scanner.next().charAt(0);
	for(char i = input; i>='A';i--) {
		for(char j = input;j>=i;j--) {
			System.out.print(j);
			
		}
		System.out.println("");
	}
}
}
