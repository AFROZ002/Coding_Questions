package Arrays_Questions_Interview;

import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,5,7,7};
        int n= arr.length;
        Arrays.sort(arr);
        int largest=arr[n-1];
        for(int i=n-2;i>=0;--i){
            if(arr[i]!=largest){
                int second_Largest=arr[i];
                break;
            }
        }
        System.out.println();


    }
}
