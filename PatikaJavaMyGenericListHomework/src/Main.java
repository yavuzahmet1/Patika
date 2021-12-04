import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyList<Integer>myList=new MyList<>();
        System.out.println("getCapacity metodu kullanıldı\t: "+myList.getCapacity());
        System.out.println("getListLenght metodu kullanıldı\t: "+myList.getListLenght());
        System.out.println("Kapasite metodu kullanıldı\t: "+Arrays.toString(myList.getListMy()));
        myList.add("Ahmet");
        myList.add("Ahmet");
        System.out.println("Kapasite metodu kullanıldı\t: "+myList.getCapacity());
        System.out.println("Uzunluk metodu kullanıldı\t: "+myList.getListLenght());
        System.out.println("Kapasite metodu kullanıldı\t: "+Arrays.toString(myList.getListMy()));
        myList.add(20);
        System.out.println("Kapasite metodu kullanıldı\t: "+myList.getCapacity());
        System.out.println("Uzunluk metodu kullanıldı\t: "+myList.getListLenght());
        System.out.println("Kapasite metodu kullanıldı\t: "+Arrays.toString(myList.getListMy()));

/*        System.out.println(myList.getCapacity());
        System.out.println("Dizideki eleman sayısı\t: "+myList.getListLenght());
        myList.add(1222);

        System.out.println(myList.toArray());


        System.out.println("Dizideki eleman sayısı\t: "+myList.getListLenght());


        System.out.println(myList.getCapacity());*/


        //System.out.println("Başkasının yazdığı kodlar aşağıda*******************");
/*        MyList3<Integer> liste = new MyList3<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList3<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());*/
        ///******************************
    /*    MyList2<Integer> liste = new MyList2<>();
        liste.add(40);
        liste.add(20);
        liste.add(35);
        liste.add(65);
        liste.add(20);
        System.out.println("Dizinin kapasitesi: "+liste.getCapacity());
        System.out.println("Dizinin eleman sayısı: "+liste.getSize());
        System.out.println(liste.getArr()[0]); //dizinin ilk elemanı.
        liste.get(2);
        liste.remove(2);
        liste.get(2);
        liste.set(2, 100);
        liste.get(2);
        System.out.println(liste.toString());
        System.out.println(liste.indexOf(20));
        System.out.println(liste.lastIndexOf(20));
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");
        liste.clear();
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");
        System.out.println(liste.toString());
        System.out.println(liste.contains(54) ? "İçerir" : "İçermez");
        Object[] objArr = liste.toArray();
        System.out.println(objArr[0]);*/
    }
}
