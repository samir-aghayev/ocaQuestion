package tasks;

public class Transition<E1 extends Number, E2 extends Number, E3 extends Number> {
    private E1 e1;
    private E2 e2;
    private E3 e3;

    public Transition(E1 e1, E2 e2, E3 e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public E1 getE1() {
        return e1;
    }

    public E2 getE2() {
        return e2;
    }

    public E3 getE3() {
        return e3;
    }

    public double sum() {
        return e1.doubleValue() + e2.doubleValue() + e3.doubleValue();
    }
}
