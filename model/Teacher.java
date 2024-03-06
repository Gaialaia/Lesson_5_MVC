package Lesson_3_4.model;

public class Teacher extends User{ //class Student, Teacher - Single Responsibility 
    
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastname, int teacherID) {
        super(firstName, secondName, lastname);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" + 
        "teacherID=" + teacherID + " " +
        super.toString() + 
        "}" ;
    }

    
}
