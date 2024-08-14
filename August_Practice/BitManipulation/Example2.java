package August_Practice.BitManipulation;

public class Example2 {
    public  static  int  [] length2(int [] arr, int n){
        int res=0;
        for(int i=0;i<n;++i){
            res=res^arr[i];
        }
        int sb=res&-res;
        int x=0;
        int y=0;
        for(int i=0;i<n;++i){
            if((arr[i]&sb)!=0){
                x=x^arr[i];
            }
            else{
                y^=arr[i];
            }
        }

        return new int []{x,y};

    }
    public static void main(String[] args) {
        int [] arr=new int[]{5,4,1,4,3,5,1,2};
        int n=arr.length;
       int len[]= length2(arr,n);
        System.out.println("First element is :"+len[0]+"second element is :"+len[1]);
    }
}
