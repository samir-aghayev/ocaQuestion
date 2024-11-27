package tasks;

public class Pair<E> {
    private E data1;
    private E data2;


    public Pair(E data1, E data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public static <E extends Comparable<E>> E smallestValue(Pair<E>data) {
        E data1= data.getData1();
        E data2= data.getData2();
        return (data1.compareTo(data2) >= 0) ? data2 : data1;
    }


    public E getData1() {
        return data1;
    }

    public E getData2() {
        return data2;
    }

}
