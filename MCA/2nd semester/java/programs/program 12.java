// Student class
class Student {
    // Data members
    protected int rollNumber;
    protected String name;
    protected double academicScore;

    // Constructor to initialize data members of Student
    public Student(int rollNumber, String name, double academicScore) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.academicScore = academicScore;
    }
}

// Sports class
class Sports {
    // Data member
    protected double sportsScore;

    // Constructor to initialize data member of Sports
    public Sports(double sportsScore) {
        this.sportsScore = sportsScore;
    }
}

// Result class inherited from Student and Sports
class Result extends Student {
    // Inherit sportsScore from Sports
    private double sportsScore;

    // Constructor to initialize data members of Result
    public Result(int rollNumber, String name, double academicScore, double sportsScore) {
        // Call the constructor of the superclass (Student) to initialize its data members
        super(rollNumber, name, academicScore);
        // Initialize data member of Result
        this.sportsScore = sportsScore;
    }

    // Display function to display academic and sports score
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Result object
        Result result = new Result(101, "John", 85.5, 95.0);

        // Display academic and sports score
        System.out.println("Details of the student:");
        result.display();
    }
}
