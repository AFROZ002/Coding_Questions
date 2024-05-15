package String_Interview_Questions;

public class MostFrequentChar_in_String {
    public  static int  MostFrequent(String str1){
        int n=str1.length();
        int [] cf=new int [256];
        int n1= cf.length;
        for(char c:str1.toCharArray()){
            cf[c]++;
        }
//        for(int i=0;i<n;++i){
//            cf[str1.charAt(i)]=cf[str1.charAt(i)]+1;
//
//        }
        int max=-1;
        int min=Integer.MAX_VALUE;
        char ch2=' ';
        char ch1=' ';
        for (int i=0;i<n;++i){
            if(max<cf[str1.charAt(i)]){
                max=cf[str1.charAt(i)];
                ch1=str1.charAt(i);

            }
            if(min>cf[str1.charAt(i)]){
                min=cf[str1.charAt(i)];
                ch2=str1.charAt(i);
            }

        }
////        return ch1;
//        return ch2;
        int diff=max-min;
        return diff;


    }

    public static void main(String[] args) {
        String str="abaacc";
//   char ms=    MostFrequent(str);
//        System.out.println(ms);

      int ms2=  MostFrequent(str);
        System.out.println(ms2);

    }
}
