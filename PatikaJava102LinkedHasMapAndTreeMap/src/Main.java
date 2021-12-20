import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer,Student> students=new TreeMap<>(new OrderByNoComparator());
//.reversed() metodunu kullanmamız durumunda tersden çalışacaktır
        students.put(102,new Student(102,"Ahmet",73));
        students.put(120,new Student(163,"Mehmet",90));
        students.put(111,new Student(104,"Ali",96));
        students.put(112,new Student(105,"Eda",88));

        for (Student stu:students.values()){
            System.out.println(stu.getName());
        }
    }
}
