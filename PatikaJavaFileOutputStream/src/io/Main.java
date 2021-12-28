package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        String yazi = "\noutputstrem kullanıyorum\nAhmet YAVUZ";
        try {
            File file = new File("patika.txt");
            FileOutputStream output = new FileOutputStream(file, true);//veri aktarmak için true eklenir
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
