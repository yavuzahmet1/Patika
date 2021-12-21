import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });
        books.add(new Book(80, "Çocuk Kalbi", "Edmondo De Amicis "));
        books.add(new Book(111, "Dede Korkut Masalları", "Dede Korkut"));
        books.add(new Book(142, "Pinokyo", "C.Collodi "));
        books.add(new Book(64, "La Fontaın Masalları", "La Fontain"));
        books.add(new Book(96, "Mutlu Prens", "Oscar Wilde"));
        books.add(new Book(80, "Vatan Yahut Silistre", "Namık Kemal"));
        books.add(new Book(127, "Yalnız Efe", "Ömer Seyfettin"));
        books.add(new Book(79, "Şermin", "Tevfik Fikret"));

        System.out.println("\nKitap adına göre sıralanmış haliyle\n");
        for (Book s : books) {
            System.out.println("# " + s.getBookName());
        }
        TreeSet<Book> page = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        System.out.println("\nKitap sayfa sayısına göre sıralanmış haliyle\n");
        for (Book s : books) {
            System.out.println("# " + s.getPageNumber());
        }
    }
}
