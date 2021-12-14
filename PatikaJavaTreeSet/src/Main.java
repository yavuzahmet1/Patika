import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet<>();
        treeSet.add(100);
        treeSet.add(-12);
        treeSet.add(30);
        treeSet.add(33);
        treeSet.add(57);
        treeSet.add(95);

        for (Integer s:treeSet){
            System.out.println(s);
        }
    }
}
