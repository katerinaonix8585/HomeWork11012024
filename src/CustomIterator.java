import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

    private T[] array;
    private int currentIndex = 0;
    public CustomIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        return array[currentIndex++];
    }
}