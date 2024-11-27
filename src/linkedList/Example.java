package linkedList;

import java.util.function.BiFunction;

public class Example {
    public static void main(String[] args) {
        int a = 5;
        double b = 15;
        BiFunction<Integer, Double, Double> sum = (x, y) -> x / y;
        Double apply = sum.apply(a, b);
        System.out.println(apply);
    }
}
