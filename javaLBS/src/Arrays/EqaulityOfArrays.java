package Arrays;


public class EqaulityOfArrays {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		int arr2[] = {4,3,2,1};
		boolean isEqual = true;
		
		int sortedArr1[] = BubbleSort.sortArray(arr1);
		int sortedArr2[] = BubbleSort.sortArray(arr2);
		
		if (sortedArr1.length == sortedArr2.length) {	
			for (int i = 0; i < sortedArr1.length; i++) {
				if (sortedArr1[i] != sortedArr2[i]) {
					isEqual = false;
					break;
				}
			}	
		}else {
			isEqual = false;
		}
		if (isEqual == true) {
			System.out.println("Both Arrays are Equal");
		}else {
			System.out.println("Arrays are not Equal");
		}
	}
}
