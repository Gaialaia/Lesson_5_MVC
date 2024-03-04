package Lesson_3_4.view;

import java.util.List;

import Lesson_3_4.User;

public interface IUsersView <T extends User>{
    
    public void printOnConsole (T user);

    public void printOnConsoleArray (List<T> users);




}
