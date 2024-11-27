package linkedList.task;

public class MinMaxText {
    public static void main(String[] args) {
        MinMax<Integer> arr = new MinMax<>(new Integer[]{1, 6, 9, 36, 65, 56, 86, 96});
        System.out.println("minimum element: "+arr.getMin());
        System.out.println("maximum element: "+arr.getMax());
    }
}
