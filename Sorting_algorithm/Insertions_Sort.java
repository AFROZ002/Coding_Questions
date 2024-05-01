package Sorting_algorithm;

public class Insertions_Sort {
    public static void Insertion(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j;
            for (  j = i - 1; j >= 0 && arr[j] > temp; --j) {
                arr[j + 1] = arr[j];
            }
            arr[j+1 ] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr=new int []{8,4,1,5,9,2};
        int n= arr.length;
      Insertion(arr,n);
      for(int i=0;i<n;++i) {


          System.out.print(arr[i]);
      }
    }
}
