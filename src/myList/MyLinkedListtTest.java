package myList;

public class MyLinkedListtTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> a=new MyLinkedList<>(10);
        a.addTail(15);
        a.addTail(25);
        a.addTail(15);
        a.addTail(25);
        System.out.println(a);

        System.out.println(a.getMiddle2());

    }
}
