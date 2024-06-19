package Arrays;


public class MedianOfSortedArrays {
	public static void main(String[] args) {

		int arr1[] = {1,2,3,4}; 
		int arr2[] = {3,4,5,6};
		int arr3[] = new int[arr1.length*2];
		
		for(int i = 0; i < arr1.length; i++){
			arr3[i] = arr1[i];
			arr3[i + arr1.length]= arr2[i];
		}
		
		for(int j = 0; j < arr3.length; j++) {
			for (int k=0; k<arr3.length-1; k++){
				if (arr3[k] > arr3[k+1]) {
					int temp = arr3[k];
					arr3[k] = arr3[k+1];
					arr3[k+1] = temp;
				}
			}
		}
		double median = (arr3[arr1.length-1] + arr3[arr1.length]) / 2.0;
		System.out.println(median);
	}
}