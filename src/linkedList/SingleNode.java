package linkedList;

public class SingleNode<E> {
    private E data;
    private SingleNode<E> next;

    public SingleNode(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return data;
    }

    public SingleNode<E> getNext() {
        return next;
    }

    public void setNext(SingleNode<E> next) {
        this.next = next;
    }
}
