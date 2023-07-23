package practice;

import java.util.Arrays;

public class ArrayCopying {
public static void main(String[] args) {
	/*output:
		[1, 2, 3, 4, 5, 6]
				*/
	int c=0;
	int[] arr = new int[] {1,2,3,4,5,6};
	c = arr.length;
	int[] copy = new int[c];
	for(int i=0;i<arr.length;i++) {
	    copy[i]=arr[i];
			}
	System.out.println(Arrays.toString(copy));

}

}