package String_Interview_Questions;

public class Reverse_String {
    public static String StringReverse(String s1) {
        char ch1[] = s1.toCharArray();
        int n = ch1.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            if (!Character.isLetter(ch1[low])) {
                low++;
            } else if (!Character.isLetter(ch1[high])) {
                high--;
            } else {
                char temp = ch1[low];
                ch1[low] = ch1[high];
                ch1[high] = temp;
                low++;
                high--;
            }
        }
        return new String(ch1);
    }

    public static void main(String[] args) {
        String s1 = "afroz123alams";
        String s2 = StringReverse(s1);
        System.out.println(s2);
    }
}
