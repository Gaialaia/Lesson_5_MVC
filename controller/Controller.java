package Lesson_3_4.controller;

import java.util.Collections;
import java.util.List;

import Lesson_3_4.StudentGroupService;
import Lesson_3_4.Teacher;
import Lesson_3_4.model.UserType;
import Lesson_3_4.service.DataService;
import Lesson_3_4.view.StudentView;



public class Controller {

    DataService dataService = new DataService();
    StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, UserType.STUDENT);
    }

    public void getAllStudents() {
        studentView.printOnConsoleArray(dataService.getAllStudents());
    }


// — Создать метод в Контроллере, в котором агрегируются функции 
// получения списка студентов (их id) и 
// преподавателя (его id) и формирования учебной группы,
//  путём вызова метода из сервиса;


    StudentGroupService studentGroupService = new StudentGroupService();

    public void getStudentListWithTeacher(Teacher teacher, List<Student> students) {
       

    }

      public void  createStudentListWithTeacher(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.printOnConsoleArray(studentGroupService.getStudentGroup());
    }

   
    
}
