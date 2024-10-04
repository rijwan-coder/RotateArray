package ra;


import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // if k is greater than n
        reverse(arr, 0, n - 1);    // We will Reverse the entire array
        reverse(arr, 0, k - 1);     // Then Reverse the first k elements
        reverse(arr, k, n - 1);     // And last Reverse the rest of the array
    }

    // Now Function to reverse elements of an array between two indices
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Array after " + k + " rotations: " + Arrays.toString(arr));
    }
}
