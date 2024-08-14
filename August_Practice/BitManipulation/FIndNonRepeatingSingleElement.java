package August_Practice.BitManipulation;

public class FIndNonRepeatingSingleElement {
    public  static  int  non1(int [] arr, int n){
        int r=0;
        for(int i:arr)
            r=r^i;

        return r;
    }
    public static void main(String[] args) {
        int [] arr=new int[]{5,4,1,4,3,3,5,1,2};
        int n= arr.length;
       int res= non1(arr,n);
        System.out.println(res);
    }
}
