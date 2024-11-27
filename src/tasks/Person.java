package tasks;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.getId(), that.getId());
    }

    @Override
    public String toString() {
        return "id=%d, name='%s', age=%d, salary=%s".formatted(id, name, age, salary);
    }
}
