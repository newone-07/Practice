package practice;

public class dowhileloop {
public static void main(String[] args) {
	int i =0;
	do {
		if(i==9)
		{
			i++;
		  continue;
		}
		System.out.println(i);
		i++;
	}
	while(i<=10);
}
}
   