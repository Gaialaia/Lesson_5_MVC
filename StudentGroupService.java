package Lesson_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class StudentGroupService {
    

    private StudentGroup studentGroup;


    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }



    public void createStudentGroup(List<Student> students) {
        this.studentGroup = new StudentGroup(students);
    }



    public Student getStudentFromStudentGroup(String firstName, String secondName){
        
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstname().equalsIgnoreCase(firstName)
               && student.getLastname().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getSortedStudentGroup() {
        List<Student>  studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }


    public List<Student> getSortedStudentGroupbyName() {
        List<Student>  studentList = new ArrayList<>(studentGroup.getStudentList());
        // Collections.sort(studentList, new StudentComparator());
        studentList.sort(new UserComparator <Student>());
        return studentList;
    }

}
