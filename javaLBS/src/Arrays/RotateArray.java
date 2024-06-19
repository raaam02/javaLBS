package Arrays;

import java.util.Arrays;

public class RotateArray {
	public static int[] rotateArray(int arr[],int d) {
		for (int i = 0; i < d; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8};
		System.out.println("Rotate Array 4 time" + Arrays.toString(rotateArray(array, 4)));
	}
}
