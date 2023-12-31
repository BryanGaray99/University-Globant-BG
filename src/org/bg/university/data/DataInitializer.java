package org.bg.university.data;

import org.bg.university.model.*;
import org.bg.university.model.Class;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for initializing the university with some data
 * @author Bryan Garay
 */
public class DataInitializer {
    /**
     * Initializes the university with some data
     * @param university University object to initialize
     */
    public static void initializeData(University university) {
        // Initialize teachers
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("John Smith", 50, 10, 3000);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher("Maria Rodriguez", 65,  35, 3000);
        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("László Nagy", 30, 2000, 15);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher("Elena Fernandez", 25, 2000, 12);

        university.addFullTimeTeacher(fullTimeTeacher1);
        university.addFullTimeTeacher(fullTimeTeacher2);
        university.addPartTimeTeacher(partTimeTeacher1);
        university.addPartTimeTeacher(partTimeTeacher2);

        // Initialize students
        Student student1 = new Student("Askar Sibgatulin", 20);
        Student student2 = new Student("Anastasia Korchagina", 22);
        Student student3 = new Student("András Horváth", 21);
        Student student4 = new Student("Ana Silva", 23);
        Student student5 = new Student("Carlos Bedarev", 19);
        Student student6 = new Student("Olga Petrova", 24);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);

        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");

        // Initialize classes
        Class class1 = new Class("Math 101", "Room 101", fullTimeTeacher1, new WeeklySchedule(daysOfWeek, "08:30", "10:00"));
        class1.addStudent(student1);
        class1.addStudent(student2);

        Class class2 = new Class("History 201", "Room 201", partTimeTeacher1, new WeeklySchedule(daysOfWeek, "15:00", "17:00"));
        class2.addStudent(student1);
        class2.addStudent(student3);
        class2.addStudent(student4);

        Class class3 = new Class("Physics 301", "Room 301", fullTimeTeacher2, new WeeklySchedule(daysOfWeek, "09:45", "12:00"));
        class3.addStudent(student1);
        class3.addStudent(student3);
        class3.addStudent(student5);

        Class class4 = new Class("Literature 401", "Room 401", partTimeTeacher2, new WeeklySchedule(daysOfWeek, "13:00", "14:30"));
        class4.addStudent(student6);

        university.addClass(class1);
        university.addClass(class2);
        university.addClass(class3);
        university.addClass(class4);
    }
}
