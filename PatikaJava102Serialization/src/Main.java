import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Car car = new Car("Audi", "A5");

/*        try {
            FileOutputStream outputFile = new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(car);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            FileInputStream inputFile=new FileInputStream("araba.txt");
            ObjectInputStream inputStream=new ObjectInputStream(inputFile);
            Car newCar=(Car)inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            inputFile.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
