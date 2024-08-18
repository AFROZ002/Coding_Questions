//package StreamAPI.stream_Basic_Questions;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Find_First_Greater_Value {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the n1 value");
//        int n1=sc.nextInt();
//        List<Integer> l5 = Arrays.asList(1, 2, 6, 3, 4);
//
//        Stream<Integer>st=l5.stream();
//
//        int fgn=l5.stream().filter(n->n>=n1).findFirst().orElse(null);
//        System.out.println(fgn);
//
//
//        List<String> words = Arrays.asList("short", "medium", "longestword");
//        String longest = words.stream()
//                .max(Comparator.comparingInt(String::length))
//                .orElse("");
//
//        System.out.println(longest);
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        // Using method reference to refer to the static method Integer.toString
//        List<String> stringNumbers = numbers.stream()
//                .map(Integer::toString)
//                .collect(Collectors.toList());
//
//        System.out.println(stringNumbers);
//
//
//
//
//    }
//}
