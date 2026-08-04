package Laboratory1.challenge1;
import java.util.ArrayList;

public class Challenge1{
    private ArrayList<Student> Students; //The list of the students in our group.

    /**
     * Constructor of the challenge, we begin to answer the problem.
     */
    public Challenge1(){
        for(int i = 0; i < 3; i++){
            this.Students.add(askStudent(i+1));
        }

        presentAnswer();
        
    }

    /**
     * Method to ask the student his 
     * @param numEstudiante
     */
    private askStudent(int numEstudiante){
        println("Estudiante #"+String.valueOf(numEstudiante)+" por favor diga su nombre");
    }

    /**
     * Method to present the answer of the challenge.
     */
    private presentAnswer(){

    }

    public static void main(String[] args){
        Welcomemessage.Welcome();
        new Challenge1();
    }
}
class Student{
    private String name;
    private Integer age;
    private String email;
    private Integer semester;
    //Constructor of student
    public Student(String name, Integer age, String email, Integer semester){
        this.name=name;
        this.age=age;
        this.email=email;
        this.semester=semester;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public Integer getSemester(){
        return this.semester;
    }
}

class Welcomemessage{
 public static void Welcome(){
    System.out.println("Hello and Welcome\n\n We are ");
 }
}