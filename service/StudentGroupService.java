
// Создать класс УчебнаяГруппаСервис, в котором реализована 
// функция (входные параметры - (Teacher, List<Strudent>))
//  формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;

package Lesson_3_4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Lesson_3_4.Student;
import Lesson_3_4.StudentGroup;
import Lesson_3_4.Teacher;
import Lesson_3_4.model.UserType;

public class StudentGroupService extends DataService {  //Open-Closed 

    StudentGroup studentGroup;

    

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup () {
        return studentGroup;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    @Override
    public void create(String firstName, String secondName, String lastName, UserType type) {
        super.create(firstName, secondName, lastName, type);
    }

    
    
}
