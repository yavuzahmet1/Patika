public class Student {
    private int no;
    private String name;
    private int note;

    public Student(int no,String name,int note){
        this.no=no;
        this.name=name;
        this.note=note;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
