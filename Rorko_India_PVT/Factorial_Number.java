package Rorko_India_PVT;

public class Factorial_Number {
    public  static  int Fact(int n){
//        if(n==0){
//            return n;
//
//        }
        int res=1;
        for(int i=n;i>0;--i){
            res=res*i;
        }
        return  res;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fact(n));;
    }
}
