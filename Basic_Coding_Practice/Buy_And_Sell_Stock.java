package Basic_Coding_Practice;

public class Buy_And_Sell_Stock {
    public  static  int stock(int [] arr, int n){
        int smallest=arr[0];
        for(int i=0;i<n;++i){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int  arr []=new int[]{7,1,5,3,6,4};
        int n= arr.length;
     int result=stock(arr,n);
        System.out.println(result);

    }
}
