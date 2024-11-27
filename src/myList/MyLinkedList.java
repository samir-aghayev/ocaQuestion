package myList;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private int size;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
        this.size++;
    }

    public void addTail(E data) {
        MyNode<E> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(new MyNode<>(data));
        this.size++;
    }

    public MyNode<E> getHead() {
        return head;
    }

    public void addFirst(E data) {
        this.head = new MyNode<>(data, head);
        this.size++;
    }


    @Override
    public String toString() {
        String result = "[";
        MyNode<E> curr = head;
        while (curr != null) {
            result = result.concat(curr + " -> ");
            curr = curr.getNext();
        }
        return result.concat("null]");
    }

    public int getSize() {
        return size;
    }


    MyNode<E> deleteNode(int x) {
        if (x == 1) {
            head = head.getNext();
        } else {
            MyNode<E> before = head;
            MyNode<E> curr = head.getNext();
            int count = 1;
            while (curr.getNext() != null) {
                count++;
                if (count == x) {
                    before.setNext(curr.getNext());
                    break;
                }

            }
        }
        return head;
    }


    E getMiddle() {
        int count = 1;
        MyNode<E> curr = head;
        while (curr.getNext() != null) {
            count++;
            curr = curr.getNext();
        }
        if (count % 2 != 0) {
            count = (count + 1) / 2;
        } else {
            count = count / 2 + 1;
        }
        curr = head;
        int newCount = 1;
        while (curr.getNext() != null) {
            if (newCount == count) {
                return curr.getData();
            }
            newCount++;
            curr = curr.getNext();
        }
        return null;
    }

    E getMiddle2() {
        if (head == null) {
            return null;
        }
        MyNode<E> slow = head;
        MyNode<E> fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow.getData();
    }

}
