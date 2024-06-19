package Arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] revArr(int arr[]) {
		int temp = 0;
		int j = arr.length - 1;
		
		for (int i = 0; i < j; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		System.out.println("Reversed an Array: " + Arrays.toString(revArr(array)));
	}
}
