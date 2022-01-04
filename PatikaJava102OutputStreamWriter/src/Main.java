import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {
        String data = "Patika ile Java102 Dersleri";

        try {
            // FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // OutputStreamWriter
            OutputStreamWriter output = new OutputStreamWriter(file);

            output.write(data);

            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
