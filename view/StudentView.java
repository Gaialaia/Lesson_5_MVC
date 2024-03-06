package Lesson_3_4.view;

import java.util.List;

import Lesson_3_4.Student;

public class StudentView implements IUsersView<Student>{  //Single Responsibility 

    @Override
    public void printOnConsole(Student user) {
        System.out.println(user);

        
        
    }

    @Override
    public void printOnConsoleArray(List<Student> users) {
        for (Student student: users) {
            System.out.println(student);
        }
        
    }

    

    
    
}
