import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File dizin = new File("test");
        dizin.mkdir();
        File dizin2=new File("Dev/testFile");
        dizin2.mkdirs();//olamayan dizini oluşturması için mkdirs(); metodu kullanılır.
        File file = new File("Patika.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        file.delete();//oluşturulan dosyayı siler

        File dizinBul=new File("diziBul");
        String[] liste=dizin2.list();

        for (String str:liste){
            System.out.println(str);
        }

    }
}
