package linkedList.task;

import java.util.Arrays;
import java.util.List;

public class PintArray {
    public static void main(String[] args) {

    }

    public static <E> void printArray(E[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null");
            return;
        }
        Arrays.stream(arr).forEach(e -> System.out.println(e + " "));
        System.out.println();
    }

    public static <E> E findFirst(List<E> arr, E item) {
        if (arr == null || arr.isEmpty()) {
            System.out.println("Array is null");
            return null;
        }
        return arr.contains(item)?item:null;
    }
}
