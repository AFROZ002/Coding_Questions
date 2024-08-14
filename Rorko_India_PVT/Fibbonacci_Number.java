package Rorko_India_PVT;

public class Fibbonacci_Number {
    public  static  int Fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fact=0;
        int a=0;
        int b=1;
        for(int i=2;i<=n;++i){
            fact=a+b;
            a= b;
            b=fact;

        }
            return fact;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Fibbo(n));
    }
}
