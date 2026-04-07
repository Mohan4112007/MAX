Task 1: Sum of Two Integers

public class Task1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum = x + y;
        System.out.println("Sum: " + sum);
    }
}


Task 2: Double Variable for Height

public class Task2 {
    public static void main(String[] args) {
        double height = 1.75;  // height in meters
        System.out.println("Height: " + height + " meters");
    }
}


Task 3: Casting Double to Int

public class Task3 {
    public static void main(String[] args) {
        double value = 9.78;
        int intValue = (int) value; // type casting
        System.out.println("Original double value: " + value);
        System.out.println("After casting to int: " + intValue);
    }
}


Task 4: Employee Class

class Employee {
    String name;
    int id;
    int age;
    int experience;
    double salary;
    String companyName;

    // Constructor
    Employee(String name, int id, int age, int experience, double salary, String companyName) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.companyName = companyName;
    }

    // Display details
    void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: $" + salary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 28, 5, 50000.00, "TechCorp");
        emp.display();
    }
}


Task 5: Calculator Class

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(15, 25);
        System.out.println("Sum: " + result);
    }
}


Task 6: Student Information System (Using Scanner)

import java.util.Scanner;

class Student {
    int student_id;
    String name;
    String email;
    int age;
    String grade;
    String address;

    void display_student_info() {
        System.out.println("\n--- Student Information ---");
        System.out.println("ID: " + student_id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student ID: ");
        s.student_id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Email: ");
        s.email = sc.nextLine();

        System.out.print("Enter Age: ");
        s.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Grade: ");
        s.grade = sc.nextLine();

        System.out.print("Enter Address: ");
        s.address = sc.nextLine();

        s.display_student_info();
        sc.close();
    }
}


Task 7: Static and Instance Variables

class StudentStatic {
    static String schoolName = "Sunrise High School";
    String name;

    StudentStatic(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic("Alice");
        StudentStatic s2 = new StudentStatic("Bob");

        s1.display();
        s2.display();
    }
}
