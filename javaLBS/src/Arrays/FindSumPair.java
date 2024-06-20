package Arrays;

public class FindSumPair {
	public static String pairOfSum(int arr[], int sum) {
		String pairs = "";
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					pairs += "(" + arr[i] + "," + arr[j] + ")";
				}
			}
		}
		return pairs.length() > 0 ? pairs : "No Pairs found";
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,-1,-2,-3};
		System.out.println("Pairs whose some are equal: " + pairOfSum(array, 50));
	}
}
