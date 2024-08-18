package StreamAPI.stream_Basic_Questions;

public class Main {
    public static void main(String[] args) {
        String input = "3 alice 05-06-2000 3 12345678 empty (022)-2456-7890 5 BobParson empty 1+9156728192 10 AliceWeasley empty 2 12345678 98765432 20";
        UserMainCode umc = new UserMainCode();
        String result = umc.mergeContacts(input);
        System.out.println(result);
    }
}