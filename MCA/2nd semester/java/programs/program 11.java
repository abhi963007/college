import java.util.Scanner;

// Employee class
class Employee {
    // Data members
    protected int empId;
    protected String name;
    protected double salary;
    protected String address;

    // Constructor to initialize data members
    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Teacher class inheriting from Employee
class Teacher extends Employee {
    // Additional data members
    private String department;
    private String subjectsTaught;

    // Constructor to initialize data members of Teacher and Employee
    public Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        // Call the constructor of the superclass (Employee) to initialize its data members
        super(empId, name, salary, address);
        // Initialize data members of Teacher
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Display function to display all data members
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of teachers
        System.out.println("Enter the number of teachers:");
        int n = scanner.nextInt();

        // Create an array of Teacher objects
        Teacher[] teachers = new Teacher[n];

        // Input details for each teacher
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");
            System.out.println("Employee ID:");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("Salary:");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.println("Address:");
            String address = scanner.nextLine();
            System.out.println("Department:");
            String department = scanner.nextLine();
            System.out.println("Subjects Taught:");
            String subjectsTaught = scanner.nextLine();

            // Create Teacher object and add it to the array
            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
        }

        // Display details of all teachers
        System.out.println("Details of all teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
        }

        scanner.close();
    }
}
