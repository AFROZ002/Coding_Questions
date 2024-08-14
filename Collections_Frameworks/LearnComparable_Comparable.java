package Collections_Frameworks;

import java.util.*;


class  MyCustomDogComparator implements   Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        return  Integer.compare(o1.weight, o2.weight);
    }

//    @Override
//    public int compare(Animal o1, Animal o2) {
//        return o1.weight- o2.weight;
//     return  Integer.compare(o1.weight, o2.weight);
//    }
}


public class LearnComparable_Comparable {


    public static void main(String[] args) {

        Animal a1=new Animal(4,"Leo",10);
        Animal a2=new Animal(4,"Dog",14);
        Animal a3=new Animal(4,"Max",16);
        Animal a4=new Animal(3,"Janwar",18);

        List<Animal>l5=new ArrayList<>();
        l5.add(a1);
        l5.add(a2);
        l5.add(a3);
        l5.add(a4);

//        Collections.sort(l5, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return 0;
//            }
//        });

        Collections.sort(l5,new MyCustomDogComparator());
//        Collections.sort(l5, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return  o1.name.compareTo(o2.name);
//            }
//        });
        System.out.println(l5);





    }
}
