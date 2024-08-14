package Rorko_India_PVT;

public class String_Reverse1 {
    public  static  String  String_Rev(String st1, int n1){
        char [] CharArray=st1.toCharArray();
        int left=0;
        int right=CharArray.length-1;
        while (left<right){
            char  temp=CharArray[left];
            CharArray[left]=CharArray[right];
            CharArray[right]=temp;
            left++;
            right--;

        }
        return new String(CharArray);

    }
    public static void main(String[] args) {
        String st1 ="Afroz Alam";
        int n1=st1.length();

        System.out.println(String_Rev(st1,n1));
    }
}
