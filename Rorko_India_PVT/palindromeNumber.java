package Rorko_India_PVT;

public class palindromeNumber {
    public static void main(String[] args) {
        int num=121121;
         int rev=0;
         int  rem;
         int temp=num;

         while(temp!=0){
             rem=temp%10;
             rev=rev*10+rem;
             temp=temp/10;

         }
         if(num==rev){
             System.out.println("yes it is palindrom");
         }
         else{
             System.out.println("No its not a palindrome");
         }
    }
}
