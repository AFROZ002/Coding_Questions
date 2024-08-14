package Rorko_India_PVT;

public class String_Reverse  {
    public  static  String Reverse(String st1,int n1){
        String rev="";
        for(int i=n1-1;i>=0;--i){
            rev=rev+st1.charAt(i);
        }
        return  rev;
    }
    public static void main(String[] args) {
        String st1 ="Afroz";
        int n1=st1.length();

       String res= Reverse(st1,n1);
        System.out.println(res);


    }
}
