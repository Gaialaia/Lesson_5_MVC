package Lesson_3_4.model;

public class Student extends User {  //class Student, Teacher - Single Responsibility, Liskov Substitution 

    private int studentID;

    public Student(String firstName, String secondName, String lastname, int studentID) {
        super(firstName, secondName, lastname);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + "" + 
        super.toString() + '}';
    }

    
    
}
