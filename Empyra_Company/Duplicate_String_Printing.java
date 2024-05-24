package Empyra_Company;

public class Duplicate_String_Printing {
    public  static  void Dupicate(String str1){
        int  [] cc=new int [256];
        int n= cc.length;
        for(int i=0;i<str1.length();++i){
            cc[str1.charAt(i)]++;
        }
        for(int i=0;i<n;++i){
            if(cc[i]>1){
                System.out.print((char)i+" "+cc[i]);
            }
        }

    }
    public static void main(String[] args) {
        String str1="Programming";
//        int n=str1.length();
        Dupicate(str1);
    }
}
