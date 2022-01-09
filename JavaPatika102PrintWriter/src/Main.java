import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	String data="Java 102 modüllerin sonuna geliyoruz.";
    try {
        PrintWriter printWriter=new PrintWriter("newPatika.txt");
        printWriter.print(data);
        printWriter.close();
    }catch (Exception e){

    }
    }
}
