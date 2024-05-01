package Sorting_algorithm;

public class Insertions_Sort_While {
    public static void main(String[] args) {
        int [] arr=new int []{8,4,1,5,9,2};
        int n= arr.length;

        for(int i=0;i<n;++i){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }

        }
        for(int i=0;i<n;++i){
            System.out.print(" "+arr[i]);
        }
    }
}
