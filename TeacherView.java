package Lesson_3_4;

import java.util.List;

//— Создать класс УчительВью и реализовать аналогично проделанному на семинаре;

public class TeacherView implements UserView <Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for(Teacher teacher : list) {
            System.out.println(teacher);
        }
        
    }

    
    
}
