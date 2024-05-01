package Array_Rearrange;

public class AR1 {
    public static void Reg(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid < high) {
            switch (arr[mid]) {
                case 0: // If the element is 0, swap it with the element at index 'low' and increment both 'low' and 'mid'
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1: // If the element is 1, just increment 'mid'
                    mid++;
                    break;
                case 2: // If the element is 2, swap it with the element at index 'high' and decrement 'high'
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 2, 1};
        int n = arr.length;
        Reg(arr, n);
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}

