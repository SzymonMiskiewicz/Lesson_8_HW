package Data;

import Tools.SchoolClass;
import Tools.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Export {


    public static void exportToFile(String fileName, List<SchoolClass>schoolClasses) throws SchoolException {
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))){
            for( SchoolClass schoolClass: schoolClasses) {
                writer.println(schoolClass.getClassDescription());
                writer.println("Student in class: ");
                for (Student student:schoolClass.getStudentList()){
                       writer.println(student.toString());
                }
                writer.println(Student.DESKS);
            }
        }catch (FileNotFoundException e){
            throw new SchoolException("File: "+ fileName+"is not found"+e.getMessage());
        }
    }
}

