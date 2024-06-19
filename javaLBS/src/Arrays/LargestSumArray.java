package Arrays;

import java.util.Arrays;

public class LargestSumArray {
	
	public static void largSum(int arr1[], int arr2[]) {
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum2 += arr2[i];
		}
		
		if (sum1 == sum2) {
			System.out.println("Both the Arrays have equal sum of Elements");
		}
		else if (sum1 > sum2) {
			System.out.println(Arrays.toString(arr1) + " has Largest sum of Elements");
		}
		else {
			System.out.println(Arrays.toString(arr2) + " has Largest sum of Elements");
		}	
	}
	
	public static void main(String[] args) {
		int array1[] = {1,2,3,4};
		int array2[] = {2,3,4,5};
		largSum(array1, array2);
	}
}
