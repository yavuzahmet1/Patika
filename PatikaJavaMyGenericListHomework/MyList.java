import java.util.Arrays;

public class MyList<T> {
    private int capacity;
    private int count = 0;
    private int size;
    private Object[] listMy;//T[] türünde liste oluşturldu

    public MyList() {//parametresiz constructor
        listMy = new Object[10];
        //this.listLenght = 0;
    }

    public MyList(int capacity) {//parametreli constructor, dizi boyutu dinamik olduğundan.
        this.capacity = capacity;
        listMy = new Object[this.capacity];

    }

    public Object[] getListMy() {
        return listMy;
    }

    public void listWiew() {
        System.out.println(Arrays.toString(listMy));
    }

    public int getCapacity() {
        System.out.println("Dizinin kapasite miktarı: " + getListMy().length);
        System.out.println("Doluluk miktarı : " + NotNullNumber() + "/" + getListMy().length);
        return getListMy().length;
    }

    public int NotNullNumber() {
        int count = 0;
        for (Object q : listMy) {
            if (q != null) {
                count++;
            }
        }
        return count;

    }

    public int nullNumber() {
        int count = 0;
        for (Object q : listMy) {
            if (q == null) {
                count++;
            }
        }
        return count;
    }


//public int getListLenght() {
//  return listLenght;
//

//public void setListLenght(int listLenght) {
//   this.listLenght = listLenght;
//

    public void add(Object data) {
        for (int i = 0; i < getListMy().length; i++) {
            if (listMy[i] == null) {
                listMy[i] = data;
            } else {
                Object[] temp = getListMy();
                listMy = new Object[getCapacity() * 2];
                for (int a = 0; a < temp.length; i++) {
                    listMy[i] = temp[i];
                }
            }
        }
    }


    public int capacityIncrease() {
        //capacity=this.capacity*2;
        return capacity = 100;
    }

    public void test() {
        System.out.println("Dizinin mevcut kapasitesi : " + listMy.length);
    }
}
