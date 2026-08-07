package Laboratory1.challenge1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        
        // Ask for the number of students x students
        System.out.print("How many students do you want to register? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println();
        
        // Loop to ask for data exactly x times
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Entering data for Student " + (i + 1) + ":");
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter age: ");
            Integer age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter semester: ");
            Integer semester = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Create and add the student to the list
            studentsList.add(new Student(name, age, email, semester));
            System.out.println(); // Blank line for spacing
        }

        // 1. Print the welcome message (prints "Hello and welcome!\n\nWe are ")
        Welcomemessage.Welcome();
        
        // 2. Print the formatted team presentation dynamically
        for (int i = 0; i < studentsList.size(); i++) {
            Student s = studentsList.get(i);
            String studentInfo = s.getName() + ", a " + getOrdinal(s.getSemester()) + "-semester student, " + s.getAge() + " years old";
            
            if (i == studentsList.size() - 1) { 
                // If it's the last student, add "and " before their info
                if (studentsList.size() > 1) {
                    System.out.println("and " + studentInfo + ".\n");
                } else {
                    // Just in case someone registers only 1 student
                    System.out.println(studentInfo + ".\n");
                }
            } else {
                // If it's not the last student, just add a comma
                System.out.println(studentInfo + ",");
            }
        }

        // 3. Print the emails
        System.out.println("Our institutional emails are:");
        for (Student s : studentsList) {
            System.out.println(s.getEmail());
        }

        // Close scanner
        scanner.close();
    }

    // Helper method to format semester numbers (1st, 2nd, 3rd, 4th, 5th...)
    private static String getOrdinal(int number) {
        if (number >= 11 && number <= 13) {
            return number + "th";
        }
        switch (number % 10) {
            case 1:  return number + "st";
            case 2:  return number + "nd";
            case 3:  return number + "rd";
            default: return number + "th";
        }
    }
}

class Student {
    private String name;
    private Integer age;
    private String email;
    private Integer semester;

    // Constructor of student
    public Student(String name, Integer age, String email, Integer semester) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.semester = semester;

    // Constructor of student
    public Student(String name, Integer age, String email, Integer semester) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }

    // Getters
    public String getName() { return name; }
    public Integer getAge() { return age; }
    public String getEmail() { return email; }
    public Integer getSemester() { return semester; }
}

class Welcomemessage {
    public static void Welcome() {
        // Adjusted exactly to fit the requested string format
        System.out.print("Hello and welcome!\n\nWe are ");
    }
}