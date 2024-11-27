package tasks;

public class Association<E, U> {
    private E e;
    private U u;

    public Association(E e, U u) {
        this.e = e;
        this.u = u;
    }

    public E getE() {
        return e;
    }

    public U getU() {
        return u;
    }

}
