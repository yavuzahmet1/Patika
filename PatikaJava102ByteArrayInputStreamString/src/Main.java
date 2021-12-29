import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
	String data="Patika 102 Dersleri!";
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        byte[] dataByteArray=data.getBytes();
        try {
            output.write(dataByteArray);
            String newData=output.toString();
            System.out.println("Çıkış Akışı\t: "+newData);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
