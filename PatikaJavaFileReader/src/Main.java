import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
	try {
        FileReader fileReader=new FileReader("patika.txt");
        int i=fileReader.read();
        while (i!=-1){
            System.out.print((char) i);
            i= fileReader.read();
        }
        fileReader.close();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }


    }
}
