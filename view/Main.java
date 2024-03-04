package Lesson_3_4.view;

import Lesson_3_4.controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("Vasya", "Ivanovich", "Khokhlov");
        controller.createStudent("Khloya", "Ivanovich", "Khokhlov");
        controller.createStudent("Ragneda", "Popovich", "Khokhlov");
        controller.createStudent("Vladislava", "Ivanovich", "Khokhlov");
        controller.getAllStudents();
        
    }
    
}
