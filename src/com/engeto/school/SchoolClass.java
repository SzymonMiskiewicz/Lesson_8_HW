package com.engeto.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    String className;
    String classYear;
    String classTeacherName;
    String classTeacherSurname;
    List<Student> studentList = new ArrayList<>();
    int numberOfStudents;

    Student student = new Student();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public String getClassTeacherSurname(){
        return classTeacherSurname;
    }
    public void setClassTeacherSurname(String classTeacherSurname){
        this.classTeacherName = classTeacherSurname;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getDescription(){
        StringBuilder stringBuilder = new StringBuilder(
                "Class: "+className + " (Class Year: "+ classYear +")\n"
        +"Teacher: " + classTeacherName + ", " + classTeacherSurname+"\n"
        +"Number of students: " + numberOfStudents);
        return stringBuilder.toString();

    }
    String description(){
        return this.student.getId()+", "+this.student.getName()+" "+this.student.getSurName()+" "
                +this.student.getBirthDay();
    }
    String descriptionT(){
        return className + ", " + this.classTeacherName +" "+this.classTeacherSurname;
    }


}
