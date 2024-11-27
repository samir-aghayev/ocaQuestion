package hashmaptasks;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    private HashMap<String, List<Employee>> employeeHashMap;

    public Task3() {
        this.employeeHashMap = new HashMap<>();
    }

    public void addEmployee(String department, Employee employee) {
        employeeHashMap.putIfAbsent(department, new ArrayList<>());
        employeeHashMap.get(department).add(employee);
    }

    public List<Employee> employeeList(String department) {
        return employeeHashMap.getOrDefault(department, new ArrayList<>());
    }

    public String findHighestDepartment() {
        int number = -1;
        String departmentName = null;
        for (Map.Entry<String, List<Employee>> employeeListEntry : employeeHashMap.entrySet()) {
            if (number < employeeListEntry.getValue().size()) {
                number = employeeListEntry.getValue().size();
                departmentName = employeeListEntry.getKey();
            }
        }
        return departmentName;
    }
}
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "name='%s',  salary=%s".formatted(name, salary);
    }
}