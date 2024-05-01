package Arrays_Questions_Interview;

public class Arrays_Reverse {
    public static void main(String[] args) {
        int [] arr={23,44,66,9,8,10};
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;++k) {


            System.out.print(arr[k] + " ");
        }
    }
}
