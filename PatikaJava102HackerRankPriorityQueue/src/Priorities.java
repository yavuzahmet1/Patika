import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        List<Student> res = new ArrayList<>();
        String[] vals;
        String name;
        double cpga;
        int id;
        for (String e : events) {
            vals = e.split(" ");
            if (vals.length == 4) {
                name = vals[1];
                cpga = Double.parseDouble(vals[2]);
                id = Integer.parseInt(vals[3]);

                priorityQueue.add(new Student(id, name, cpga));
            } else {
                res.add(priorityQueue.poll());
            }
        }
        return res;
    }
}
