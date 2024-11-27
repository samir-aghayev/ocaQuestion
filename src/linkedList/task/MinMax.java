package linkedList.task;

public class MinMax<T extends Comparable<T>> {
    private final T[] elements;

    public MinMax(T[] elements) {
        this.elements = elements;
    }

    public T getMin() {
        if (elements == null || elements.length == 0) {
            return null;
        }
        T min = elements[0];
        for (T t : elements) {
            if (min.compareTo(t) > 0) {
                min = t;
            }
        }
        return min;
    }

    public T getMax() {
        if (elements == null || elements.length == 0) {
            return null;
        }
        T max = elements[0];
        for (T t : elements) {
            if (max.compareTo(t) < 0) {
                max = t;
            }
        }
        return max;
    }
}
