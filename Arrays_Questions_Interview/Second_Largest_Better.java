package Arrays_Questions_Interview;

public class Second_Largest_Better {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,7,7,5};
        int largest=arr[0];
        int n=arr.length;
        for(int i=0;i<n;++i){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int sl=-1;
        for(int i=0;i<n;++i){
            if(arr[i]>sl  || arr[i]!=largest){
                sl=arr[i];
            }

        }
        System.out.println("the sl element is "+sl);
    }
}
//Time complexcity is O(2n);
