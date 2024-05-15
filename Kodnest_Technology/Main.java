package Kodnest_Technology;
import java.util.Scanner;

public class Main {
    public static String analysis(String input, int k) {

        String[] arr = input.split("\\s+");
            int n = arr.length;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(arr[n - i - 1]) - (k + i - 1);
                result.append(num).append(" ");

            }
            return result.toString().trim();

        }



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int k = scanner.nextInt();
            String output = analysis(input, k);
            System.out.println(output);


        }

    }