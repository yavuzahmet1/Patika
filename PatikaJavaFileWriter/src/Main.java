import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
	String data="Java öğreniyorum";
    try {
        FileWriter fileWriter=new FileWriter("output.txt");
        fileWriter.write(data);
        fileWriter.close();
    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
