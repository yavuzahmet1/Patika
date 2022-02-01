
public class Main {
    static int reverse(int num) {
        int temp = num,rev = 0,lastnum;
        while (temp != 0) {
            lastnum = temp % 10;
            rev = (rev * 10) + lastnum;
            temp /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int number = 75;
        System.out.println(reverse(number));
        int total=number+reverse(number);
        
        if (total==reverse(total)){
            System.out.println("Palindrom sayidir\t: "+reverse(total));
        }else{
            System.out.println("Palindrom sayi değildir.\t: "+reverse(total));
        }



    }
}
