package hashmaptasks;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Task 1------------------------------");

        Task1 task = new Task1();
        task.addScore("Ali", 85);
        task.addScore("Ali", 90);
        task.addScore("Murad", 78);
        task.addScore("Murad", 82);
        task.addScore("Nicat", 88);
        task.addScore("Nicat", 95);

        System.out.println("Ali's average: " + task.averageScore("Ali"));
        System.out.println("Murad's average: " + task.averageScore("Murad"));
        System.out.println("Nicat's average: " + task.averageScore("Nicat"));
        System.out.println("Max point's student: " + task.findMaxAverageStudent());


        System.out.println("--------------------Task 2------------------------------");
        Task2 inventoryManager = new Task2();
        inventoryManager.addProduct(new Product("Laptop", 5800, 5));
        inventoryManager.addProduct(new Product("Phone", 2000, 10));
        inventoryManager.addProduct(new Product("HeadPhones", 500, 3));
        inventoryManager.updateProductQuantity("Laptop", 4);
        inventoryManager.displayBelowStockLevel(6);


        System.out.println("--------------------Task 3------------------------------");

        Task3 employeeManagementSystem = new Task3();

        // Adding employees to departments
        employeeManagementSystem.addEmployee("IT", new Employee("Ali", 800));
        employeeManagementSystem.addEmployee("IT", new Employee("Murad", 750));
        employeeManagementSystem.addEmployee("HR", new Employee("Nicat", 500));
        employeeManagementSystem.addEmployee("HR", new Employee("Vuqar", 520));
        employeeManagementSystem.addEmployee("Sales", new Employee("Samir", 600));

        System.out.println("Employees in IT:");
        for (Employee emp : employeeManagementSystem.employeeList("IT")) {
            System.out.println(emp);
        }
        String highestDept = employeeManagementSystem.findHighestDepartment();
        System.out.println("Department with the highest number of employees: " + highestDept);

    }
}