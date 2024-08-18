//package StreamAPI;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class MethodReferenceExample {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        // Using method reference to refer to the static method Integer.toString
//        List<String> stringNumbers = numbers.stream()
//                .map(Integer::toString)
//                .collect(Collectors.toList());
//
//        System.out.println(stringNumbers);
//    }
//}
