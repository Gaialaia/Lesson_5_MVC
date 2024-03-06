package Lesson_3_4.service;

import Lesson_3_4.User;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.List;

import Lesson_3_4.Teacher;
import Lesson_3_4.model.UserType;
import Lesson_3_4.model.Student;

public class DataService {  //Open-Closed 
    //Data service управляет и объединяет сущности User, Liskov Substitution: User может быть Teacher и Student
    
    List<User> users = new ArrayList<>();

   public void create(String firstName, String secondName, String lastName, UserType type) {
    int ID = getFreeId(type);
    if(type == UserType.STUDENT) 
        users.add(new Student(firstName, secondName, lastName, ID)); //?? ()??
    else if (type == UserType.TEACHER) {
        users.add(new Teacher(firstName, secondName, lastName, ID));
    }

   }

   private int getFreeId(UserType userType) {
        for (int i = users.size() - 1 ; i >=0; i--) {
            User user = users.get(i);
            if (user instanceof Student && userType == UserType.STUDENT)
                return ((Student) user).getStudentID() + 1;
                if (user instanceof Teacher && userType == UserType.STUDENT)
                return ((Teacher) user).getTeacherID() + 1;

        }
        return 1;

    }

        public List <Student> getAllStudents() { //пригодится в контрольной
            List <Student> students = new ArrayList<>();
            for (User user : users) {
                if (user instanceof Student) 
                students.add((Student)user);
            }
            return students;
        } 

   }



 



    

