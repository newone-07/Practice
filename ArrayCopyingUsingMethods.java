package practice;

import java.util.Arrays;

public class ArrayCopyingUsingMethods {
public static void main(String[] args) {
	/*arr1 = [1, 2, 3, 4, 5, 6, 7]
arr2 = [1, 2, 3, 4, 5, 6, 7]
arr3 = [1, 2, 3, 4]
*/
	int[] arr = {1,2,3,4,5,6,7};
	//copying using assigning operator
	int[] arr1 = arr;
	int[] arr2 = new int[arr.length];
	//copying using array copy in java
	System.arraycopy(arr1, 0, arr2, 0, arr.length);
	//copying using copy of range
	int[] arr3 = Arrays.copyOfRange(arr, 0, 4);
	System.out.println("arr1 = "+ Arrays.toString(arr1));
	System.out.println("arr2 = "+ Arrays.toString(arr2));
	System.out.println("arr3 = "+ Arrays.toString(arr3));
}
}
