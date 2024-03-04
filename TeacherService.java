package Lesson_3_4;

import java.util.ArrayList;
import java.util.List;

// — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;


public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService () {
    this.teachers = new ArrayList <>();

    }
    @Override
    public List<Teacher> getAll() {
       return teachers;
        
    }

    @Override
    public void create(String firstName, String secondName, String lastname) {
        Integer countMaxId = 0;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherID() > countMaxId) {
                countMaxId = teacher.getTeacherID();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, lastname, null);
        teachers.add(teacher);


        
    }
  
    
}
