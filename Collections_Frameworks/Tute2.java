package Collections_Frameworks;

import java.util.ArrayList;
import java.util.List;

public class Tute2 {
    public static void main(String[] args) {
        List<Integer> l5=new ArrayList<>();
        l5.add(10);
        l5.add(59);
        l5.add(39);
        l5.add(70);
        l5.add(50);

        System.out.println(l5);

        l5.remove(4);

        System.out.println("After removing element  by index "+l5);

        l5.remove(Integer.valueOf(10));

        System.out.println("After removing by giving the list element "+l5);
    }

}
