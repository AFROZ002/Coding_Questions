package String_Interview_Questions;

public class String_Array_Sorting_Selection {
    public static void main(String[] args) {
        String [] arr={"shayam","afroz alam","mahesh ganjaswag","utkarsh"};
        int n=arr.length;
        int min;
        String temp;
        for(int i=0;i<n;++i){
            min=i;
            for(int j=i+1;j<n-1;++j){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;

                }

            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }

    }
}
