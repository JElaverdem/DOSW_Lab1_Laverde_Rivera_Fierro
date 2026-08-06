package Laboratory1.challenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge1 {
    private ArrayList<Student> students; // The list of the students in our group.

    /**
     * Constructor of the challenge, we begin to answer the problem.
     */
    public Challenge1() {
        this.students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            this.students.add(askStudent(i + 1));
        }
        presentAnswer();
    }

    public static void main(String[] args) {
        Welcomemessage.Welcome();
        new Challenge1();
    }

    /**
     * Method to ask the student his data
     * @param numEstudiante
     */
    private Student askStudent(int numEstudiante) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("student #" + numEstudiante + " please enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("student #" + numEstudiante + " please enter your age:");
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.println("student #" + numEstudiante + " please enter your email:");
        String email = scanner.nextLine();
        
        System.out.println("student #" + numEstudiante + " please enter your semester:");
        int semester = Integer.parseInt(scanner.nextLine());

        return new Student(name, age, email, semester);
    }

    /**
     * Method to present the answer of the challenge.
     */
private void presentAnswer() {
        System.out.println("Hello and welcome!\n");
        System.out.print("We are ");
        
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (i !=0) {
                System.out.print("and ");
            }
            System.out.print(s.getName() + ", a " + s.getSemester() + "th-semester student, " + s.getAge() + " years old");
            if (i < students.size() - 1) {
                System.out.println(",");
            } else {
                System.out.println(".\n");
            }
        }
        
        System.out.println("Our institutional emails are:");
        for (Student s : students) {
            System.out.println(s.getEmail());
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
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getSemester() {
        return this.semester;
    }
}

class Welcomemessage {
    public static void Welcome() {
        System.out.println("Hello and Welcome\n\n We are the team!");
    }
}