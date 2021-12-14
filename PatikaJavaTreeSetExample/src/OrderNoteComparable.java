import java.util.Comparator;

public class OrderNoteComparable implements Comparator<Student> {//notlara göre sıralama metodu
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote()-o2.getNote();
    }
}
