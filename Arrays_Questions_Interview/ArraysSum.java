package Arrays_Questions_Interview;

public class ArraysSum {
    public  static  int Sum(int [] nums, int n){
//
//int maxi=Integer.MIN_VALUE;
//        for(int i=0;i<n;++i){
//            int sum=0;
//            for(int j=i;j<n;++j){
//                sum=sum+arr[j];
//
//                maxi=Math.max(sum,maxi);
//
//            }
//
//
//
//        }
//
//        return maxi;

        int  maxi=Integer.MIN_VALUE;
        int  sum=0;
//        int n=nums.length;
        for(int i=0;i<n;++i){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int arr []=new int [] { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n= arr.length;
       int result= Sum(arr, n);
        System.out.println(result);
    }
}
