public class Main {

    public static void main(String[] args) {
 /*       GenericMetods<Integer> xx = new GenericMetods<>(10);
        xx.run();*/
        Integer a = 10;
        String b = "patika";
        Double c = 3.14;
        Generics<Integer, String, Double> t = new Generics<>(a, b, c);
        t.showInfo();
    }
}
