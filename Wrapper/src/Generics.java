public class Generics <T1,T2,T3>{
    private T1 obje1;
    private T2 obje2;
    private T3 obje3;

    public Generics(T1 obje1,T2 obje2,T3 obje3){
        this.obje1=obje1;
        this.obje2=obje2;
        this.obje3=obje3;
    }

    public T1 getObje1() {
        return obje1;
    }

    public void setObje1(T1 obje1) {
        this.obje1 = obje1;
    }

    public T2 getObje2() {
        return obje2;
    }

    public void setObje2(T2 obje2) {
        this.obje2 = obje2;
    }

    public T3 getObje3() {
        return obje3;
    }

    public void setObje3(T3 obje3) {
        this.obje3 = obje3;
    }
    public void showInfo(){
        System.out.println("T1 :"+obje1.getClass().getName());
        System.out.println("T2 :"+obje2.getClass().getName());
        System.out.println("T3 :"+obje3.getClass().getName());
        System.out.println("*************************");
        System.out.println("T1 :"+obje1.getClass().getSimpleName());
        System.out.println("T2 :"+obje2.getClass().getSimpleName());
        System.out.println("T3 :"+obje3.getClass().getSimpleName());
    }
}
