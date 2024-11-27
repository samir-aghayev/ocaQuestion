package linkedList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add("Samir");
        list.add("Ali");
        list.add("Vali");
        list.add("Nurlan");
        printList(list);
        list.remove("Ali");
        printList(list);
    }

    private static <E> void printList(List<E> list) throws NoSuchFieldException, IllegalAccessException {
        Field elementData = ArrayList.class.getDeclaredField("elementData");
        elementData.setAccessible(true);
        Object[] o = (Object[]) elementData.get(list);
        System.out.println(Arrays.toString(o));
    }
}
