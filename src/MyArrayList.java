import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyArrayList<T, E> extends AbstractList<E>
        implements List<E> {
    private Object[] data;
    private int size;
    private int capacity;

    public int size(){
        return size;
    }


    public boolean contains (Object o){
        Object[] array = data;
        for (int i = 0; i <= array.length; i++){
            if (array[i] == o){
                return true;
            }
            return false;
        }
        return false;
    }

    public int indexOf(Object o) {
        Object[] array = data;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }



    public T get(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        return (T) data[index];

    }

}

