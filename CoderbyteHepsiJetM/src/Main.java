import java.util.Scanner;

public class Main {
    public static int SearchinChallenge(int num){
        int total=0;
        for (int i=0;i<num;i++){
            if ((i%3==0)||(i%5==0)){
                total+=i;

            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(SearchinChallenge(s.nextInt()));
    }
}
