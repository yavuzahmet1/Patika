public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    @Override
    public int compareTo(Student student) {
        double diffCGPA=student.cgpa-this.cgpa;
        if (diffCGPA==0D){
            if (student.name.equals(this.name)){
                return student.id-this.id;
            }else {
                return this.name.compareTo(student.name);
            }
        }else {
            return diffCGPA<0?-1:1;
        }

    }
}
