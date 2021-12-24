import java.util.Scanner;

public class Main {
    public static String Palindrome(String str) {
        //String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
        String newStr="";
        for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)) {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(Palindrome("Tat"));
    }
}
