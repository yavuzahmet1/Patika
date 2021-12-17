import java.util.*;

public class Main {

    public static void main(String[] args) {
	List<String>list=new LinkedList<>();
    list.add("Ahmet");
    list.add("YAVUZ");
    list.add("Mustafa");
    list.add("Java");
    list.add("102");

    list.remove(2);

    Iterator<String>itr=list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    for (String str:list){
        System.out.println(str);
    }

    }
}
