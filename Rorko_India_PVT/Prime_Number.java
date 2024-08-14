package Rorko_India_PVT;

public class Prime_Number {
    public  static  boolean Prime(int n){
        if(n==1 || n==0){
            return false;

        }
        if(n%2==0){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(Prime(n));
    }
}
