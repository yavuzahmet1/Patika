import java.util.Arrays;

public class MyList2 <T>{
    private Object[] arr; //object tipinde bir dizi oluşturdum,İçine farklı veri tiplerinden değer atamak için.
    private int size;
    private int capacity=10;

    public MyList2() {
        arr = new Object[10];
        size=0;
    }
    public MyList2(int capacity){
        arr = new Object[capacity];
        size=0;
    }

    public Object[] getArr() {
        return arr;
    }

    public int getCapacity() {
        return getArr().length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T data){
        if(size<getArr().length){ //dizinin eleman sayısı kapasitesinden küçük mü?
            for(int i=0; i<= getArr().length;i++){
                if(getArr()[i]==null){
                    getArr()[i]=data;
                    setSize(getSize()+1);
                    break;
                }
            }
        }else{
            Object[] temp = getArr();
            arr = new Object[getCapacity()*2];
            for(int i=0; i<=temp.length;i++){
                arr[i]=temp[i];
                arr[size]=data;
                size++;
            }

        }
    }
    public void get(int index){
        if(getArr()[index]!=null && index<=getArr().length){
            System.out.println("Dizinin "+index+". indeksi "+getArr()[index]);
        }
        else{
            System.out.println("Dizinin "+index+". indeksi nulldur.");
        }
    }
    public void remove(int index){
        if(getArr()[index]!=null && index>=0 && index<=getArr().length){
            for(int i =index; i<getArr().length; i++){
                if(i+1<getArr().length){
                    getArr()[i] = getArr()[i+1];
                    if(getArr()[i]==null){
                        break;
                    }
                }else{
                    getArr()[i]=null;
                }
            }
        }
    }
    public void set(int index, T data){
        if(index<getArr().length && index>=0){
            getArr()[index] = data;
        }
    }
    public int indexOf(T data){
        int index = -1;
        for(int i=0; i< getArr().length; i++){
            if(getArr()[i].equals(data)){
                index = i;
                break;
            }

        }
        return index;
    }
    public int lastIndexOf(T data){
        int index = -1;
        for(int i= getArr().length-1; i>=0; i--){
            T value = (T)this.getArr()[i];
            if(value == data) {
                index = i;
                break;
            }
        }
        return index;
    }
    public boolean isEmpty(){
        if(getArr().length==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void clear(){
        for(int i = 0; i<getArr().length; i++ ){
            getArr()[i]=null;
        }
    }
    public T[] toArray(){
        T[] values = (T[]) arr;
        return values;
    }

    boolean contains(T data){
        boolean isContains = false;
        for(int i=0; i<getArr().length; i++){
            if(getArr()[i]==data){
                isContains=true;
            }
            else{
                isContains=false;
            }
        }
        return isContains;
    }
    MyList3<T> sublist(int start, int finish){
        MyList3<T> subMyList = new MyList3<>(finish-start+1);

        if(start>=0 && start<this.getArr().length && finish>=0 && finish<this.getArr().length){
            for(int i=0, j=start; j<=finish; i++, j++) {
                subMyList.toArray()[i] = (T) this.getArr()[j];
            }
        }
        return subMyList;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
