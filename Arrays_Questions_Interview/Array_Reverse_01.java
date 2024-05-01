package Arrays_Questions_Interview;

import java.util.Arrays;

public class Array_Reverse_01 {
    public  static  void Rajdoot(int [] arr, int n){
        int j = 0; // Index to track the last swapped negative element

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If current element is negative, swap it with arr[j]
            if (arr[i] < 0) {
                if (i != j) { // Avoid unnecessary swaps
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++; // Increment j to track the next position for a negative element
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={-1,-2,-4,-45,4,89,9,-11,13,14,-18,-20};
        int n=arr.length;

//        Arrays.sort(arr);
        Rajdoot(arr,n);
        for (int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }
}
