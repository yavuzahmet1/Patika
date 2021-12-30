import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("input.txt");

            BufferedInputStream input = new BufferedInputStream(file);
            input.skip(2);
            System.out.println("Kullanılabilir byte : " + input.available());

            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                i = input.read();
            }

            System.out.println("Kullanılabilir byte : " + input.available());

            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
