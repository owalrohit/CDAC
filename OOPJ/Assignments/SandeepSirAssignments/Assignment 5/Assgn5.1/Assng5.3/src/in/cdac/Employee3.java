
package in.cdac;

public class Employee3 {
    // Static fields to track total number of employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;
    // Non-static fields for individual employee details
    private int id;
    private String name;
    private double salary;
    // Static initializer to initialize total employees and salary expense
    static {
        System.out.println("Employee class loaded.");
    }
    // Non-static initializer to automatically update employee count and salary expense
    {
        totalEmployees++;
        totalSalaryExpense += this.salary;
    }
    // Constructor to initialize individual employee details
    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // Getter for employee name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    public static void applyRaise(double percentage, Employee3[] employees) {
        for (Employee3 emp : employees) {
            double raiseAmount = emp.salary * (percentage / 100);
            emp.updateSalary(emp.salary + raiseAmount);
        }
    }
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }
    // Overriding toString method to print individual employee details
    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
