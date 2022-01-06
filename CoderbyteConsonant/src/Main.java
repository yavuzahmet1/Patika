import java.util.Scanner;

public class Main {
    public static String ConsonantCount(String str){

        char[] letters = str.toCharArray();
        int count = 0;
        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case ' ':

                    count++;
                    break;
                default: // no count increment }


            }

        }

        return String.valueOf(letters.length-count);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(ConsonantCount(scanner.nextLine()));
    }
}
