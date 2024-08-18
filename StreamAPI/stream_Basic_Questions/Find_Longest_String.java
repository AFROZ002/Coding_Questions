//package StreamAPI.stream_Basic_Questions;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//public class Find_Longest_String {
//    public static void main(String[] args) {
//        List<String> l5 = Arrays.asList("short", "medium", "longestword");
//
//        Stream<String> st1=l5.stream();
//        Optional<String> nl=l5.stream().max(Comparator.comparing(String:: length));
//        System.out.println(nl);
//    }
//}
