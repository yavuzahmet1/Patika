public class MyList3<T> {
    private int defLength;
    private T[] array;

    public MyList3(int defLength) {
        this.defLength = defLength;
        this.array = (T[]) new Object[this.defLength];
    }

    public MyList3() {
        this.defLength = 10;
        this.array = (T[]) new Object[this.defLength];
    }

    public void add(T data) {
        int count = 0;
        T[] newArray;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = data;
                break;
            }
        }

        newArray = getArray();
        this.array = (T[]) new Object[getDefLength() * 2];
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }

    }

    public int getDefLength() {
        return defLength;
    }

    public void setDefLength(int defLength) {
        this.defLength = defLength;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getCapacity() {
        return this.array.length;
    }

    public int size() {
        int count = 0;
        for (T t : this.array) {
            if (t != null) {
                count++;
            }
        }
        return count;
    }

    public int get(int index) {
        if ((index >= 0) && (index < array.length)) {
            return (int) this.array[index];
        } else {
            return Integer.parseInt(null);
        }
    }


    public void remove(int index) {
        if ((index >= 0) && (index < array.length && this.array[index] != null)) {
            for (int i = index; i < getArray().length; i++) {
                if (i + 1 < getArray().length) {
                    this.array[i] = this.array[i + 1];
                    if (this.array[i] == null) {
                        break;
                    }
                } else {
                    this.array[i] = null;
                }
            }
        }

    }

    public T set(int index, T data) {
        if ((index >= 0) && (index < array.length)) {
            return this.array[index] = data;
        } else {
            return null;
        }
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == data) {
                return i;
            }

        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int temp = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == data) {
                temp = i;
            }

        }

        return temp;
    }

    public T[] toArray() {
        T[] newArray = this.array;
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = null;
        }
    }

    public MyList3<T> subList(int start, int finish){
        MyList3<T> subMyList = new MyList3<>(finish-start+1);
        for(int i=0, j=start; j<=finish; i++, j++) {
            subMyList.toArray()[i] = (T) this.getArray()[j];
        }
        return subMyList;
    }

    boolean contains(T data){
        boolean isContains = false;
        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] == data){
                isContains = true;
            }
        }
        return  isContains;
    }

    public String toString() {
        StringBuilder text = new StringBuilder(" ");
        for (T t : this.array) {
            if (t != null) {
                text.append(t).append(",");
            }

        }
        return "[" + text.substring(0, text.length() - 1) + "]";
    }

    public boolean isEmpty() {
        for (T t : this.getArray()) {
            if (t != null) {
                return false;
            }
        }
        return true;
    }
}
