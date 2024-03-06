
// Создать класс УчебнаяГруппа,
//  содержащий в себе поля Преподаватель и список Студентов;

package Lesson_3_4.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

   
    List <Student> students = new ArrayList<>();
    
    Teacher teacher;

    public StudentGroup(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" + 
        
        "students=" + students +  
        "teacher=" + teacher +
         "}";
    }


    
}
