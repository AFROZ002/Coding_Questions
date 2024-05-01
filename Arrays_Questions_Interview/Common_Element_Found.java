package Arrays_Questions_Interview;
import java.util.*;

public class Common_Element_Found {
    public static Set<Integer> Fcn(int[] arr1, int[] arr2) {
        Set<Integer>CommonElement=new HashSet<>();

        Set<Integer>l5=new HashSet<>();
        for(int num:arr1){
            l5.add(num);
        }
        for(int num2:arr2){
            if(l5.contains(num2)){
                CommonElement.add(num2);
            }
        }
        return CommonElement;





    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        Set<Integer> CE = Fcn(arr1, arr2);
        System.out.println("Common Elements"+ CE);

    }
}
