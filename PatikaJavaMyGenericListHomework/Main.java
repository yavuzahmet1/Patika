import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyList<Integer>myList=new MyList<>();
        myList.listWiew();
        myList.add(200);
        myList.add(999);
        myList.add(18);
        myList.add(123);
        myList.add(345);
        myList.add(456);
        myList.add(986);
        myList.add(18);
        myList.add(1234);

        myList.getCapacity();
        myList.listWiew();


    }
}
