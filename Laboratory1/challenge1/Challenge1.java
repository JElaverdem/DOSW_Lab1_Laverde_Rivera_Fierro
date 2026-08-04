package Laboratory1.challenge1;
public class Challenge1{
        public static void main(String[] args){

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
}
class Welcomemessage{
 public static void Welcome(){
    System.out.println("Hello and Welcome\n\n We are ");
 }
}