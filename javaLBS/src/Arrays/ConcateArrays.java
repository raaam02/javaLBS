package Arrays;

import java.util.Arrays;

public class ConcateArrays {
	
	public static int[] concateArray(int[] arr1, int[] arr2) {
		int arr3[] = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
		return arr3;
	}
	
	public static void main(String[] args) {
		int array1[] = {1,2,3,4,11,12,13,15};
		int array2[] = {5,6,7,8,9,10};
		int conArray[] = concateArray(array1, array2);
		System.out.println(Arrays.toString(conArray));
	}
}
