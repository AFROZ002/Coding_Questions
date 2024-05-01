package Compitation_Coding_Questions;

public class Questions1 {
    public  static  int [] Rearrange(int [] arr, int n){
        int [] temp=new int [n];

        int largest=arr[0];
        for(int i=0;i<n;++i){
            if(arr[i]>largest){
                largest=arr[i];


            }
            temp[i]=arr[i];




        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int n= arr.length;
    int [] result=Rearrange(arr, n);
        System.out.println(result);
    }
}
