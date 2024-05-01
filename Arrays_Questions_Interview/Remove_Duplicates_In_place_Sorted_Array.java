//package Arrays_Questions_Interview;
//
//public class Remove_Duplicates_In_place_Sorted_Array {
//    public  static  int Remove_Dupi(int []arr, int n){
//        int i=0;
//        for(int j=1;j<n;++j){
//            if(arr[i]!=arr[j]){
//                i++;
//                arr[i+1]=arr[j];
//
//            }
//
//        }
//        return i+1;
//    }
//    public static void main(String[] args) {
//        int [] arr=new int [] {1,1,2,2,2,3,3};
//        int n=arr.length;
//      int result=  Remove_Dupi(arr,n);
//        System.out.println(result);
//
//    }
//}
