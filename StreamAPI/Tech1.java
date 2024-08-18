package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tech1 {
    public static void main(String[] args) {


//        List<Integer> l5=new ArrayList<>();
//        l5.add(15);
//        l5.add(89);
//        l5.add(78);
//        l5.add(91);
//        l5.add(99);
//        l5.add(56);
//        l5.add(69);
//        l5.add(81);

//        List<Integer>l6=new ArrayList<>();
//        for (Integer i:l5){
//            if(i%2==0){
//                l6.add(i);
//            }
//
//        }
//        System.out.println(l6);
//
//        Stream<Integer>st=l5.stream();
//        List<Integer>newlist=st.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newlist);

//        List<Integer> nl=l5.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(nl);

//        List<Integer>nl2=l5.stream().filter(i->i>50).collect(Collectors.toList());
//        System.out.println(nl2);


//        String [] names={"Afroz Alan","Kafil Ahmad","Aqueel Raza","Shakil Ansari","Husna Bano"};
//
//        Stream<String> st1=Stream.of(names);
//        st1.forEach(e->{
//            System.out.println(e);
//        });


//        IntStream stream= Arrays.stream(new int[]{99,24,39,51,89,99,101});
//        stream.forEach(e->{
//                    System.out.println(e);
//                });

  List<String>names=List.of("Afroz","Abshiek","RDX","Majnu Bhaiya") ;
//  List<String>NNM=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());


//        List<String>NNM=names.stream().filter(e->e.toLowerCase().endsWith("x")).collect(Collectors.toList());
//        System.out.println(NNM);

        List<Integer>number=List.of(5,7,8,9,2);
//        List<Integer>nn=number.stream().map(i->i*i).collect(Collectors.toList());
//        System.out.println(nn);

//        number.stream().sorted().forEach(System.out::println);

        Integer mins=number.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(mins);
        Integer max=number.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);



    }
}
