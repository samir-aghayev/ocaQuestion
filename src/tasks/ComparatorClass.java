package tasks;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getAge() != o2.getAge()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Double.compare(o2.getSalary(), o1.getSalary());
    }
}
