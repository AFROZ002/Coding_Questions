package Rorko_India_PVT;

public class String_Reverse_Except_Special_Character {

    public  static  String  sresc(String st1){
        char [] charar=st1.toCharArray();
        int left=0;
        int right=charar.length-1;
        while (left<right){
            if(!Character.isLetter(charar[left])){
                left++;
            }
            else if(!Character.isLetter(charar[right])){
                right--;

            }
            else{
                char temp=charar[left];
                charar[left]=charar[right];
                charar[right]=temp;
                left++;
                right--;

            }
        }
        return  new String(charar);
    }
    public static void main(String[] args) {
        String st1 ="A1M2k34Z567L";
        System.out.println(sresc(st1));
    }
}
