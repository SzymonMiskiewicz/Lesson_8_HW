package com.engeto.school;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Export {
    private static final List<SchoolClass> classList = new ArrayList<>();
    private static final List<Student>students = new ArrayList<>();

    public void exportToFile(String fileName) throws SchoolException {
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))){
            for( SchoolClass schoolClass: classList) {
                writer.println(schoolClass.getClassTeacherName()+schoolClass.getClassTeacherSurname()
                        +schoolClass.getClassName()+ "\n");
                for (Student student:students){
                       writer.println( student.getId() +student.getName() + student.getSurName()
                               + student.getBirthDay());
                }
            }
        }catch (FileNotFoundException e){
            throw new SchoolException("File: "+ fileName+"is not found"+e.getMessage());
        }
    }
}

