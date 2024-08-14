//package Collections_Frameworks;
//
//public class Tute1 {
//    // Generic method to swap two elements in an array
//        public static <t> void swap(t[] array, int index1, int index2) {
//            t temp = array[index1];  // Store the value at index1 in a temporary variable
//            array[index1] = array[index2];  // Assign the value at index2 to index1
//            array[index2] = temp;  // Assign the temporary value to index2
//        }
//
//        // Main method to test the generic swap method
//        public static void main(String[] args) {
//            // Example 1: Swapping integers in an array
//            Integer[] intArray = {1, 2, 3, 4, 5};
//            System.out.println("Before swapping: ");
//            for (int num : intArray) {
//                System.out.print(num + " ");
//            }
//
//            // Swap elements at index 1 and 3
//            swap(intArray, 1, 3);
//
//            System.out.println("\nAfter swapping: ");
//            for (int num : intArray) {
//                System.out.print(num + " ");
//            }
//
//            // Example 2: Swapping strings in an array
//            String[] strArray = {"A", "B", "C", "D"};
//            System.out.println("\n\nBefore swapping: ");
//            for (String str : strArray) {
//                System.out.print(str + " ");
//            }
//
//            // Swap elements at index 0 and 2
//            swap(strArray, 0, 2);
//
//            System.out.println("\nAfter swapping: ");
//            for (String str : strArray) {
//                System.out.print(str + " ");
//            }
//        }
//    }
