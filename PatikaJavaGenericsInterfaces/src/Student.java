public class Student<T> implements IDatabase<T>{//String tanımlarsa strig'e göre tanımlanır

    @Override
    public boolean add(T data) {
        System.out.println("Veri eklendi\t: "+data);
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri silindi");
        return false;
    }

    @Override
    public boolean edit(T data) {
        System.out.println("Veri düzeltildi");
        return false;
    }

    @Override
    public T select() {
        System.out.println("Veri seçildi");
        return null;
    }
}
