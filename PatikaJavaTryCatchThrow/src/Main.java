import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws Exception{
        if (age<18){
            throw new Exception("Yaşınız tutmuyor");
        }
        System.out.println("Yaşı uygundur");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz\t: ");
        int age=scanner.nextInt();
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşı uymadı : ");
            System.out.println(e.getMessage());
        }

        System.out.println("Program bitti!!!");

    }
}
