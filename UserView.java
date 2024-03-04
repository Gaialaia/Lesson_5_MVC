package Lesson_3_4;

import java.util.List;

public interface UserView <T extends User>  {

    public void sendOnConsole(List<T> list); //list with any data type
    
}
