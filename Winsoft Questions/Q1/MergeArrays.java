package Q1;
public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Pointer for last non-zero element in X
        int i = m - n - 1;
        // Pointer for last element in Y
        int j = n - 1;
        // Pointer for last element in merged array
        int k = m - 1;
        
        // Merge elements from the end of both arrays
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k] = X[i];
                i--;
            } else {
                X[k] = Y[j];
                j--;
            }
            k--;
        }
        
        // If elements in Y[] are still remaining
        while (j >= 0) {
            X[k] = Y[j];
            j--;
            k--;
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        // Print merged array X
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}