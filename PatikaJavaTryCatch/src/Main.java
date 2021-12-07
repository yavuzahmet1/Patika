public class Main {

    public static void main(String[] args) {
        System.out.println("Program başladı");
	int a=0;
    int b=20;

    try {
        System.out.println("Bölme işlemi");
        System.out.println(b/a);//hata burada yakalanıyor
        System.out.println("Bölme işlemi bitti");//hata yakalanınca bu kısım çalışmıyor
    }catch (Exception e){
        System.out.println("Hata yakalandı");
        System.out.println(e.getMessage());
    }
        System.out.println("Program bitti");
    }
}
