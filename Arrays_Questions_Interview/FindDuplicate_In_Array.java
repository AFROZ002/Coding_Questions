//package Arrays_Questions_Interview;
//
//import java.util.Arrays;
//
//public class FindDuplicate_In_Array {
//    public  static  int  Duplicate(int [] arr, int n){
//        Arrays.sort(arr);
//        int dup=-1;
//        for(int i=1;i<n;++i){
//            if(arr[i-1]==arr[i]){
//                dup=arr[i];
//            }
//
//        }
//        return dup;
//
//    }
//    public static void main(String[] args) {
//        int  arr []=new int [] {4,2,9,7,5,4};
//        int n= arr.length;
//   int  result=     Duplicate(arr, n);
//        System.out.println(result);
//    }
//}
