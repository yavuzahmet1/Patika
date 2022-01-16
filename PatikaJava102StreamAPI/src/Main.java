import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        list.forEach(i-> System.out.println(i));
        list.stream().filter(num->num>60).forEach(i-> System.out.println(i));
        list.stream().distinct().forEach(i-> System.out.println(i));
        list.stream().limit(5).forEach(i-> System.out.println(i));
    }
}
