
public class MyList<T> {
    private int listLenght;
    private Object[] listMy;//T[] türünde liste oluşturldu

    public MyList() {//parametresiz constructor
        listMy = new Object[10];
        //this.listLenght = 0;
    }

    public MyList(int capacity) {//parametreli constructor, dizi boyutu dinamik olduğundan.
        listMy = new Object[capacity];
        //this.listLenght = 0;
    }

    public Object[] getListMy() {
        return listMy;
    }

    public int getCapacity() {
        return getListMy().length;
    }

    public int getListLenght() {
        return listLenght;
    }

    public void setListLenght(int listLenght) {
        this.listLenght = listLenght;
    }

    public void add(Object data) {
        if (getListLenght() < getCapacity()) {
            for (int i = 0; i <=getListLenght(); i++) {
                System.out.println("Listenin uzunluğu : "+getListMy().length);
                System.out.println(this.listMy[i]==null?"Boş yer var":"Boş yer yok");

                if (this.listMy[i]==null){
                    listMy[i]=data;
                    setListLenght(getListLenght()+1);
                    System.out.println("Listenin boş yerine bakıldı");
                    System.out.println("Listeye : "+data+" verisi ekleniyor...");
                    break;
                }else{
                    Object[] temp=listMy;
                    temp=new Object[getListLenght()*2];
                    for (int x=0;i<listMy.length;x++){
                        listMy[x]=temp[x];
                        listMy[i]=data;
                        listLenght++;
                    }

                }
            }
        }
    }
}
