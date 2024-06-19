package Arrays;

public class MissingNum {
	public static int missingNum(int arr[]) {
		int n = arr[arr.length-1];
		int expected = (n * (n + 1)) / 2;
		int actual = 0;
		
		for (int i = 0; i < arr.length; i++) {
			actual += arr[i];
		}
		int missNum = expected - actual;
		return missNum;
	}
	public static void main(String[] args) {
		int array[] = {1,2,3,4,0,6,7,8,9,10};
		System.out.println("Missing Number is: " + missingNum(array));
	}
}
