package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(new Person(1, "Samir", 29, 1152.45),
                new Person(2, "Ali", 26, 1834.78),
                new Person(3, "Vusal", 25, 2500.32),
                new Person(4, "Elvin", 34, 3200.10),
                new Person(5, "Murad", 30, 2850.65),
                new Person(6, "Aygun", 23, 1980.54),
                new Person(7, "Leyla", 23, 2250.75),
                new Person(8, "Rufat", 35, 3150.20),
                new Person(11, "Aygun", 28, 1980.54),
                new Person(9, "Nigar", 31, 2700.45),
                new Person(10, "Emin", 27, 1900.67)));
        people.sort((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()));
        people.forEach(System.out::println);
        people.sort(Comparator.comparingDouble(Person::getSalary));


    }
}
