import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	byte[]arr={1,2,3,4,5,66};
    ByteArrayInputStream inputStream=new ByteArrayInputStream(arr,0,5);
        System.out.println("Kullanılabilen byte sayısı : "+inputStream.available());
        inputStream.skip(2);
        int i=inputStream.read();
        while (i!=-1){
            System.out.println(i);
            i=inputStream.read();
        }
        try {
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
