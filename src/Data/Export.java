package Data;

import Tools.SchoolClass;
import Tools.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Export {
    private static final List<SchoolClass> classList = new ArrayList<>();
    private static final List<Student>students = new ArrayList<>();

    public static void exportToFile(String fileName,List<SchoolClass>schoolClasses) throws SchoolException {
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))){
            for( SchoolClass schoolClass: schoolClasses) {
                writer.println(schoolClass.getClassDescription());
                writer.println("Student in class: ");
                for (Student student:schoolClass.getStudentList()){
                       writer.println(student.toString());
                }
                writer.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        }catch (FileNotFoundException e){
            throw new SchoolException("File: "+ fileName+"is not found"+e.getMessage());
        }
    }
}

