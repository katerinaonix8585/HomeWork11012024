public class Analize<T> implements Comparer{

    private T firstValue;
    private T secondValue;

    public Analize(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public boolean compare() {
        if (firstValue.equals(secondValue)) return true;
        else return false;
    }
}
