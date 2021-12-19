import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());//reversed() metodu ile tersine de sıralama yaptırabiliriz.
        q.add("Ahmet");
        q.add("Mehmet");
        q.add("Esma");
        q.add("Damla");

        Iterator<String>itr=q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());//iterator de kullanılabilir
        }

/*        for (String s:q){
            System.out.println(s);//bu şekilde de kullanılabilir.
        }*/
    }
}
