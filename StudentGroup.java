package Lesson_3_4;

import java.util.Iterator;
import java.util.List;



// — Создать класс УчебнаяГруппа, 
//содержащий в себе поля Преподаватель и список Студентов;
// — Создать класс УчебнаяГруппаСервис, в котором реализована функция 
// (входные параметры - (Teacher, List<Strudent>)) 
// формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
// — Создать метод в Контроллере, в котором агрегируются функции получения 
// списка студентов (их id) и преподавателя (его id)
//  и формирования учебной группы, путём вызова метода из сервиса




public class StudentGroup implements Iterable<Student> {
    
    
    List<Student>  studentList;  // список студентов, из которого состоит группа

    Teacher teacher;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup(Teacher teacher2, List<Student> students) {
        //TODO Auto-generated constructor stub
    }

    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this); //передаём ссылку на экзепляр, с которым сейчас работаем
        
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    


    
}
