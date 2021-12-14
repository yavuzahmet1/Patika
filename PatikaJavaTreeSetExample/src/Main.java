import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Student>students=new TreeSet<>(new OrderNameComparable().reversed());//reversed() medodunu eklersek tersine işlem yaptırırız.
        students.add(new Student("Mustafa",50));
        students.add(new Student("Ahmet",30));
        students.add(new Student("Mehmet",80));
        students.add(new Student("Hasan",60));
        students.add(new Student("Emre",70));
        students.add(new Student("Kaya",68));

        for (Student s:students){
            System.out.println(s.getName());
        }

    }
}
