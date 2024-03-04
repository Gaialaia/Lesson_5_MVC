package Lesson_3_4;

import java.util.Iterator;

public class Student extends User implements Comparable<Student> {
    
    private Integer studentID;
    // public String firstname;
    // public String secondname;
    // public String lastname;

    public Student(Integer studentID, String firstname, String secondname, String lastname) {
        super(firstname, secondname, lastname);
        this.studentID = studentID;
    }

    public Student getStudentFromStudentGroup (String firstname, String secondname, String lastname) {
        Iterator<Student> iterator = StudentGroupIterator();
    }


    

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", firstname=" + super.getFirstname() + ", secondname=" + super.getLastname()
                + ", lastname=" + super.getSecondname() + "]";
    }

    @Override
    public int compareTo(Student o) {
        // if(studentID > o.studentID )
        // return 1;
        // if(studentID < o.studentID)
        // return -1;

        // return 0;
        return studentID.compareTo(o.studentID);
        
        
    }




    public Integer getStudentID() {
        return studentID;
    }




    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    
    
}
