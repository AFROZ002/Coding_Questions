package August_Practice.BitManipulation;

public class Find2NonRepeatingElement {
    public  static  int [] non(int [] arr,int n){
        int res=0;
        for(int i=0;i<n;++i){
            res=res^arr[i];

        }
        int sb=res & -res;
        int x=0;
        int y=0;

        for(int i=0;i<n;++i){
            if((arr[i]&sb)!=0){
                x=x^arr[i];
            }
            else{
                y=y^arr[i];
            }
        }
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        int [] arr=new int[]{5,4,1,4,3,5,1,2};
        int n= arr.length;
     int[] res=non(arr,n);
        System.out.println(res[0]+"   or second  "+res[1]);


    }
}
