package Star_Pattern_Coding_Problem;

public class Pattern2 {
    public static void main(String[] args) {
        for(int i=0;i<4;++i){
            for(int j=4;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
