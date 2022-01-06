import java.util.Scanner;

public class Main {
    public static int PrimeNumber(int num){
        boolean bool=true;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                bool = false;
                break;
            }
        }
        //return Integer.valueOf(String.valueOf(bool));
        //return Integer.valueOf("True");
        return bool;
    }
    private static boolean PrimeNumber(String nextLine) {
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(PrimeNumber(s.nextLine()));

    }


}
