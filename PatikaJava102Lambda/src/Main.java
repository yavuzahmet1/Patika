public class Main {

    public static void main(String[] args) {
        // Java 8'den öncesi
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {

                System.out.println("Before 1.8");
            }
        };
        runnable1.run();

        // Java 8'den sonrası
        Runnable runnable2 = () -> System.out.println("1.8");
        runnable2.run();
    }
}
