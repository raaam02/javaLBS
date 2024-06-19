package Arrays;

import java.util.Arrays;

public class SecondLargeEle {
	public static void main(String[] args) {
		int array[] = {214,65,476,87,3415,6,576,5,232,321};
		int sortedArray[] = BubbleSort.sortArray(array);
		
		int secLargeEle = sortedArray[sortedArray.length - 2];
		System.out.println("in this array " + Arrays.toString(sortedArray));
		System.out.println("\n2nd Largest Element is " + secLargeEle);
	}
}
