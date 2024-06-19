package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static int[] removeDuplicates(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					
					arr[j] = 0;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int array[] = {5,2,5,7,2,3,2,4};
		System.out.println(Arrays.toString(removeDuplicates(array)));
	}
}
