package Star_Pattern_Coding_Problem;

public class Combination_of_P1_and_P2 {
    public static void main(String[] args) {
        for(int i=0;i<=4;++i){
            for(int j=1;j<=i;++j){
                System.out.print("X");
            }
            System.out.println();
        }
        for (int k=1;k<=5;++k){
            for(int l=5;l>=k;--l){
                System.out.print("X");
            }
            System.out.println();
        }
    }

}
