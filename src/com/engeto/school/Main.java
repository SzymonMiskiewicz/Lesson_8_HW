package com.engeto.school;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static final String HASHTAGS = "##############################";

    public static void main(String[] args) {
        //1.
        SchoolClass sc = new SchoolClass();
        Export export = new Export();
        sc.className = "4c";
        sc.classYear = "4 year";
        sc.setClassTeacherName("Marian");
        sc.setClassTeacherSurname("Byk");
        sc.numberOfStudents = 3;

        System.out.println(HASHTAGS);
        System.out.println(sc.getDescription());
        System.out.println(HASHTAGS);
        Student student = new Student();

        List<Student> students = new ArrayList<>();
        students.add(new Student("ID001","Damian","Krat",2000));
        students.add(new Student("ID002","Pavel","Kran",2001));
        students.add(new Student("ID003","Rob","Kras",2000));
        System.out.println(students + "\n");

        // 2.
        sc.className = "4c";
        sc.classYear = "4 year";
        sc.setClassTeacherName("Marian");
        sc.setClassTeacherSurname("Byk");
        System.out.println(sc.descriptionT());
        sc.student.setId("ID001");
        sc.student.setName("Damian");
        sc.student.setSurName("Krat");
        sc.student.setBirthDay(2000);
        System.out.println(sc.description());
        sc.student.setId("ID002");
        sc.student.setName("Pavel");
        sc.student.setSurName("Kran");
        sc.student.setBirthDay(2001);
        System.out.println(sc.description());
        sc.student.setId("ID003");
        sc.student.setName("Rob");
        sc.student.setSurName("Kras");
        sc.student.setBirthDay(2000);
        System.out.println(sc.description());

        //3.
        try{
        export.exportToFile("Task 3.txt");
    }catch (SchoolException e){
            System.err.println(e.getMessage());}
    }

}
