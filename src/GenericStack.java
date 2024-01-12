import java.util.Iterator;

public class GenericStack<T> implements Iterable<T>{

    private T[] array;
    private int currentIndex = 0;

    public GenericStack(T[] array) {
        this.array = array;
    }

    public void push(T element){
        T[] newArray = (T[]) new Object[this.array.length + 1];
        for (int i = 0; i < this.array.length;i++) {
            newArray[i] = this.array[i];
        }
        newArray[newArray.length - 1] = element;
        this.array = newArray;
    }

    public T pop() {
        T[] newArray = (T[]) new Object[this.array.length - 1];
        for (int i = 0; i < this.array.length - 1;i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
        return this.array[this.array.length - 1];

    }

    @Override
    public Iterator iterator() {
        Iterator result = new CustomIterator(this.array);
        return result;
    }

}

