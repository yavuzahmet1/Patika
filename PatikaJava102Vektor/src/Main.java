import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	Vector<String>vector=new Vector<>();
    vector.add("Adana");
    vector.add("Ankara");
    vector.add("İzmir");
    vector.add("Mersin");

    vector.add(2,"Bolu");

        for (String s:vector){
            System.out.println(s);
        }

    }
}
