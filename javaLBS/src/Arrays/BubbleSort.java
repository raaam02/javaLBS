package Arrays;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		return arr;
		}
	
	public static void main(String[] args) {
		int array[] = {83,86,54,5342,76,23,465,12};
		int sortedArray[] = sortArray(array);
		System.out.println(Arrays.toString(sortedArray));
	}
}
