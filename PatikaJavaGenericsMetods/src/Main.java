public class Main {

    public static void main(String[] args) {
        String[] x = {"Java", "102", "Patika"};
        Integer[] a = {1, 2, 3, 4};
        Character[] b = {'J', 'A', 'V', 'A'};

/*          şimdi yukarıdaki ifadeleri aşağıdaki döngüler ile döndürebilirdik ama
            tamiz kod don't repeat yourself ilkesiyle bu durum bağdaşmamaktadır
            bunu önlemek için generic ifadelerden yararlanırız.
        for (Character q : b) {
            System.out.print(q);
        }
        System.out.println();
        for (String c : x) {
            System.out.print(c);
        }
        System.out.println();
        for (Integer d : a) {
            System.out.print(d);
        }*/
        //aşağıda static tanımladığımız pritArray() metodunu tanımlayarak göndereceğimiz tipde tek ifade ile döndürebiliriyoruz.
        Print.printArray(x);
        Print.printArray(a);
        Print.printArray(b);
    }
}
