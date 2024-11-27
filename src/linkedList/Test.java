package linkedList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public abstract class Test {
    public static void main(String[] args) {
        Optional<String> name1 = checkName("name");
        name1.ifPresent(System.out::println);
        Optional<String> name3 = checkName("");
        name3.ifPresent(System.out::println);
        System.out.println( checkName(null));

    }

    public static <T> T foo(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid input");
        }
        return data;
    }

    public static <E extends Comparable<E>> void sort(List<E> arr) {
        arr.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
    }

    public static Optional<String> checkName(String name) {
        return (name == null || name.isBlank()) ? Optional.empty() : Optional.of(name);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                }
            }
        }
        return arr;
    }
}




