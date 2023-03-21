package collectionArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[]elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public  MyList(int capacity){
        elements = new Object[capacity];
    }
    public void ensureCapacity(int minCapacity){
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }
    private void add(int index, E element){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        if(size == elements.length){
            ensureCapacity(1);
        }
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i +1 ];
        }
        elements[index] = element;

    }
    public E remove(int index){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        Object temp = elements[index];
        for (int i = index; i < elements.length -1; i++) {
            elements[i] = elements[i + 1];
        }
        elements = Arrays.copyOf(elements, elements.length -1);
        return (E) temp;
    }
    public int size (){
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == null){
                size++;
            }
        }
        return size;
    }
    public E clone(){
        Object[] temp = new Object[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = elements[i];
        }
        return (E) temp;
    }
    public boolean contains(Object o){
        for (int i = 0; i < size(); i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }
    public int indexof(Object o){
        int index = 0 ;
        for (int i = 0; i < size(); i++) {
            if(elements[i].equals(o)){
               index = i;
            }
        }
        return index;
    }
    public boolean add (E element){
        if (size() == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = element;
        return true;
    }
    public E get (int index ){
        if (index >=  size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }
    public void clear() {
        elements = Arrays.copyOf(elements, 0);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
