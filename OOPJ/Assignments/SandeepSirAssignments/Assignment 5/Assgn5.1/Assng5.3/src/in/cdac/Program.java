package in.cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee3> employees = new ArrayList<>();

        // Initial employees for exploring more in details
        employees.add(new Employee3(1, "ramesh", 52000));
        employees.add(new Employee3(2, "mahesh", 23000));
        employees.add(new Employee3(3, "somesh", 10000));

        boolean exit = false;

        // Menu-driven program
        while (!exit) {
            System.out.println("\n Select your choice :");
            System.out.println("1. View Total Employees");
            System.out.println("2. View Total Salary Expense");
            System.out.println("3. Apply Raise to All Employees");
            System.out.println("4. Update Individual Employee Salary");
            System.out.println("5. View Employee Details");
            System.out.println("6. Add New Employee");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("Total Employees: " + Employee3.getTotalEmployees());
                    break;
                case 2:
                    System.out.println("Total Salary Expense: " + Employee3.calculateTotalSalaryExpense());
                    break;
                case 3:
                    System.out.print("Enter raise percentage: ");
                    double percentage = scanner.nextDouble();
                    Employee3.applyRaise(percentage, employees.toArray(new Employee3[0]));
                    System.out.println("Applied " + percentage + "% raise to all employees.");
                    break;
                case 4:
                    System.out.print("Enter employee ID to update salary: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    for (Employee3 emp : employees) {
                        if (emp.getId() == id) {
                            emp.updateSalary(newSalary);
                            System.out.println("Updated salary for employee ID " + id);
                            break;
                        }
                    }
                    break;
                case 5:
                    for (Employee3 emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                case 6:
                    System.out.print("Enter new employee ID: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter new employee name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new employee salary: ");
                    double newSalaryForNewEmp = scanner.nextDouble();
                    Employee3 newEmployee = new Employee3(newId, newName, newSalaryForNewEmp);
                    employees.add(newEmployee);
                    System.out.println("Added new employee: " + newEmployee);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }
}
