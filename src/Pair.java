public class Pair<T, N> {

    private T first;

    private N second;

    public Pair(T first, N second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public N getSecond(){
        return this.second;
    }

}
