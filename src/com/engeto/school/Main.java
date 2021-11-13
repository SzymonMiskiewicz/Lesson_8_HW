package com.engeto.school;

import Data.SchoolException;
import Tools.SchoolClass;
import Tools.Student;
import Tools.Teacher;

import java.util.ArrayList;
import java.util.List;

import static Data.Export.exportToFile;

public class Main {


    public static final String HASHTAGS = "##############################";

    public static void main(String[] args) {

        //1.
        SchoolClass schoolClass = new SchoolClass("4 c"," 4 year", 3);
        Teacher teacher = new Teacher("Marian ", "Byk");
        schoolClass.setClassTeacher(teacher);

        System.out.println(HASHTAGS);
        schoolClass.printClassDescription();
        System.out.println(HASHTAGS);

        //2
        Student damianK = new Student("ID001", "Damian", "Krat", 2000);
        schoolClass.addStudent(damianK);
        Student pawelK = new Student("ID002","Paweł", "Kran", 2001);
        schoolClass.addStudent(pawelK);
        Student robK = new Student("ID003", "Rob","Kras",2002);
        schoolClass.addStudent(robK);

        schoolClass.printAllStudents();
        //3.
        List<SchoolClass>schoolClasses = new ArrayList<>();
        schoolClasses.add(schoolClass);
        try {
            exportToFile("Task 3.txt", schoolClasses);
        } catch (SchoolException e) {
            e.printStackTrace();
        }
    }

}
