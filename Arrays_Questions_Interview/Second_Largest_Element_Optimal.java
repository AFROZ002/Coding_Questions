package Arrays_Questions_Interview;

public class Second_Largest_Element_Optimal {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,7,7,5};
        int n= arr.length;

        int largest=arr[0];
        int sl=-1;
        for(int i=0;i<n;++i){
            if(arr[i]>largest){
//                sl=largest;
//                largest=arr[i];
                sl=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>sl) {
                sl=arr[i];

            }
        }
        System.out.println("The second largest element is "+ sl);


    }
}
