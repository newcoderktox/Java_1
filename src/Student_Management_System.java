class Person{
    String name;
    String surname;
    int age;

    Person(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
}
class Student extends Person{
    int studentID;

    Student(String name, String surname, int age, int studentID){
        super(name, surname, age);
        this.studentID=studentID;
    }
    void study(){
        System.out.println(name +" is studying...");

    }
}
class Teacher extends Person{
    String branch;

    Teacher(String name, String surname, int age, String branch){
        super(name,surname,age);
        this.branch=branch;
    }
    void teach(){
        System.out.println(name + " is teaching " + branch + "...");
    }
}
public class Student_Management_System {
    public static void main(String [] args){
        Student student1 = new Student("nisa", "c",19,1001);
        Teacher teacher1= new Teacher("Ayse", "Yıldız", 40, "math");
        student1.study();
        teacher1.teach();
        System.out.println("---STUDENT---");
        System.out.println("Name: "+ student1.name);
        System.out.println("Surname: "+ student1.surname);
        System.out.println("Age: "+ student1.age);
        System.out.println("Student ID: "+ student1.studentID);
        System.out.println(" ");
        System.out.println("---TEACHER---");
        System.out.println("Name: "+ teacher1.name);
        System.out.println("Surname: "+ teacher1.surname);
        System.out.println("Age: "+ teacher1.age);
        System.out.println("Branch: "+ teacher1.branch);

    }
}
