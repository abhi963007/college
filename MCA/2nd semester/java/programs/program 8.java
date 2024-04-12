import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of employees
        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();

        // Create an array of Employee objects
        Employee[] employees = new Employee[n];

        // Input employee information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.println("Employee Number:");
            int eNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Employee Name:");
            String eName = scanner.nextLine();
            System.out.println("Employee Salary:");
            double eSalary = scanner.nextDouble();

            // Create Employee object and add it to the array
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        // Input the employee number to search
        System.out.println("Enter the employee number to search:");
        int searchEno = scanner.nextInt();

        // Perform search
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getENo() == searchEno) {
                found = true;
                System.out.println("Employee found:");
                System.out.println("Employee Number: " + emp.getENo());
                System.out.println("Employee Name: " + emp.getEName());
                System.out.println("Employee Salary: " + emp.getESalary());
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with employee number " + searchEno + " not found.");
        }

        scanner.close();
    }

    static class Employee {
        private int eNo;
        private String eName;
        private double eSalary;

        public Employee(int eNo, String eName, double eSalary) {
            this.eNo = eNo;
            this.eName = eName;
            this.eSalary = eSalary;
        }

        public int getENo() {
            return eNo;
        }

        public String getEName() {
            return eName;
        }

        public double getESalary() {
            return eSalary;
        }
    }
}
