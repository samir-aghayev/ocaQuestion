package tasks;

public final class Triplet<E extends Cloneable> {
    private final E data1;
    private final E data2;
    private final E data3;

    public Triplet(E data1, E data2, E data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    private E cloneData(E data) {
        try {
            return (E) data.getClass().getMethod("clone").invoke(data);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Object is not cloneable", e);
        }
    }

    public E getData1() {
        return cloneData(data1);
    }

    public E getData2() {
        return cloneData(data2);
    }

    public E getData3() {
        return cloneData(data3);
    }
}
