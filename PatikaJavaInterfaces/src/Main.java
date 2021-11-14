import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutar giriniz\t: ");
        double price = scanner.nextDouble();
        System.out.print("Kard no giriniz\t: ");
        String cardNumber = scanner.next();
        System.out.print("Son kullanım tarihini giriniz\t: ");
        String date = scanner.next();
        System.out.print("Karta ait cvc numarasını giriniz\t: ");
        String cvc=scanner.next();
        System.out.println("1. A bankası");
        System.out.println("2. A bankası");
        System.out.println("3. A bankası");
        System.out.print("Banka seçiniz\t: ");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                ABankasi aPos = new ABankasi("Halk Bank", "012012", "12345");
                aPos.connect("127.1.5.4.2");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz.");
        }


    }
}
