package Sorting_algorithm;

public class Bubble_Sort {
    public  static void  Bubble(int [] arr, int n){
        for(int i=0;i<n;++i){
            for (int j=0;j<n-1-i;++j){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }
    public static void main(String[] args) {
        int [] arr=new int[] {19,17,16,7,89,14};
        int n= arr.length;
        Bubble(arr, n);
        for(int i=0;i<n-1;++i){
            System.out.print(arr[i]+" ");
        }

    }
}