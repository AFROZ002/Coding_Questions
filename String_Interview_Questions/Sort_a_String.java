package String_Interview_Questions;

public class Sort_a_String {
    public static void main(String[] args) {
        String [] arr={"shayam","afroz alam","mahesh ganjaswag","utkarsh"};
        int n= arr.length;
        String temp;
        for(int i=0;i<n;++i){
            for(int j=0;j<n-1-i;++j){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }


    }
}
