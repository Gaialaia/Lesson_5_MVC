package Lesson_3_4;

public class Teacher extends User {


    Integer teacherID;

        public Teacher(String firstname, String secondname, String lastname, Integer teacherID) {
        super(firstname, secondname, lastname);
        this.teacherID = teacherID;
    }

    

    @Override
    public String getFirstname() {
        
        return super.getFirstname();
    }

    @Override
    public String getLastname() {
       
        return super.getLastname();
    }

    @Override
    public String getSecondname() {
      
        return super.getSecondname();
    }

    @Override
    public String toString() {
       
        return super.toString();
    }



    public Integer getTeacherID() {
        return teacherID;
    }



    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    
    
}
