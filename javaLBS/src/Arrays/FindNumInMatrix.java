package Arrays;

public class FindNumInMatrix {
    public static String findNumInMat(int arr[][], int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    return "Row: " + i + ", Column: " + j;
                }
            }
        }
        return "Number not found";
    }

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("5 found in matrix at position: " + findNumInMat(array, 5));
        System.out.println("44 found in matrix at position: " + findNumInMat(array, 44));
    }
}

