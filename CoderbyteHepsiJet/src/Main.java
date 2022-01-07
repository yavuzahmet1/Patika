import java.util.Scanner;

public class Main {
    public static int Mat(int num){
        int count=0;
        for (int i=0;i<=num;i++){
            count+=i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(Mat(s.nextInt()));
    }
}
