package Lesson_3_4.view;

import java.util.List;

import Lesson_3_4.User;

public interface IUsersView <T extends User>{ //Liskov Substitution , User могут быть Teacher, 
    
    //Student;(Dependency Inversion Principle, ссылается на class User, используется Student & Teacher
    
    public void printOnConsole (T user);

    public void printOnConsoleArray (List<T> users);




}
