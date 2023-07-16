package practice;
import java.util.Scanner;
public class PrintingStrings {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the character from alphabet");
	char input = scanner.next().charAt(0);
	switch(input) {
	case 'a':
	case 'A':
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'b':
	case 'B':
		System.out.println("BCDEFGHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'c':
	case 'C':
		System.out.println("CDEFGHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'd':
	case 'D':
		System.out.println("DEFGHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'E':
	case 'e':
		System.out.println("EFGHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'f':
	case 'F':
		System.out.println("FGHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'g':
	case 'G':
		System.out.println("GHIJKLMNOPQRSTUVWXYZ");
		break;
	case 'h':
	case 'H':
		System.out.println("HIJKLMNOPQRSTUVWXYZ");
		break;
	case 'i':
	case 'I':
		System.out.println("IJKLMNOPQRSTUVWXYZ");
		break;
	case 'J':
	case 'j':
		System.out.println("JKLMNOPQRSTUVWXYZ");
		break;
	case 'k':
	case 'K':
		System.out.println("KLMNOPQRSTUVWXYZ");
		break;
	case 'l':
	case 'L':
		System.out.println("LMNOPQRSTUVWXYZ");
		break;
	case 'm':
	case 'M':
		System.out.println("MNOPQRSTUVWXYZ");
	case 'n':
	case 'N':
		System.out.println("NOPQRSTUVWXYZ");
		break;
	case 'o':
	case 'O':
		System.out.println("OPQRSTUVWXYZ");
		break;
	case 'p':
	case 'P':
		System.out.println("PQRSTUVWXYZ");
		break;
	case 'Q':
	case 'q':
		System.out.println("QRSTUVWXYZ");
		break;
	case 'R':
	case 'r':
		System.out.println("RSTUVWXYZ");
		break;
	case 's':
	case 'S':
		System.out.println("STUVWXYZ");
		break;
	case 't':
	case 'T':
		System.out.println("TUVWXYZ");
		break;
	case 'u':
	case 'U':
		System.out.println("UVWXYZ");
		break;
	case 'v':
	case 'V':
		System.out.println("VWXYZ");
		break;
	case 'w':
	case 'W':
		System.out.println("WXYZ");
		break;
	case 'x':
	case 'X':
		System.out.println("XYZ");
		break;
	case 'y':
	case 'Y':
		System.out.println("YZ");
		break;
	default:
		System.out.println("Z");
		
		
	}
	
}
}
