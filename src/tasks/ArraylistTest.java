package tasks;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(13);
        print(list);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(16);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        print(list);
    }

    private static <E> void print(ArrayList<E> list) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("list size: " + list.size());
        System.out.println("list capacity: " + getCapacity(list));
    }

    private static <E> int getCapacity(ArrayList<E> list) throws NoSuchFieldException, IllegalAccessException {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println(Arrays.toString(elementData));
        return elementData.length;
    }
}
