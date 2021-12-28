import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	try{
        /*File file=new File("patika.txt");
        file.createNewFile();*/
        FileInputStream input=new FileInputStream("patika.txt");
        int i=input.read();
        while (i!=-1){
            System.out.print((char) i);
            i=input.read();
        }
        input.close();


    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
