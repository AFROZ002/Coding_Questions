package Arrays_Questions_Interview;

public class Arrays_Largest_Element {
    public static void main(String[] args) {

        int arr[] = new int[]{10, 20, 30, 40, 50, 60, 70, 90};
        int n = arr.length;

        // Find the largest element
        int largest = arr[0];
        for (int i = 1; i < n; ++i) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Print the largest element
        System.out.println("Largest element: " + largest);
    }
}