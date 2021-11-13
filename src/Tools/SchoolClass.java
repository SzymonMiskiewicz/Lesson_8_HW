package Tools;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private String className;
    private String classYear;
    private Teacher classTeacher;
    private Student classStudent;
    private int numberOfStudents;
    private List<Student> studentList;

    public SchoolClass (String className, String classYear,int numberOfStudents){
        this.className = className;
        this.classYear = classYear;
        this.numberOfStudents = numberOfStudents;
        studentList = new ArrayList<>(numberOfStudents);
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudents(Student student){
        studentList.remove(student);
    }

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

    public Teacher getClassTeacher(){
        return classTeacher;
    }

    public void setClassTeacher (Teacher teacher){
        this.classTeacher = teacher;
    }

    public Student getClassStudent(){
        return classStudent;
    }
    public void setClassStudent(Student student){
        this.classStudent = student;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getClassDescription(){
        StringBuilder stringBuilder = null;
        stringBuilder =new StringBuilder(
                "Class: "+className + " (Class Year: "+ classYear +")\n"
        +"Teacher: " + classTeacher+"\n"
        +"Number of students: " + numberOfStudents);
        return stringBuilder.toString();

    }

    public void printClassDescription(){
        System.out.println(getClassDescription());
    }

    public String getAllStudents(){
        StringBuilder allStudents = new StringBuilder();
        for (Student student:studentList){
            allStudents.append(student.toString()).append("\n");
        }
        return allStudents.toString();
    }

    public void printAllStudents(){
        System.out.println(getAllStudents());
    }

    public String getClassTeacherDescription(){
        return className + classTeacher.toString();

    }

    public void printClassTeacherDescription(){
        System.out.println(getClassTeacherDescription());
    }

    public List<Student> getStudentList(){
        return studentList;
    }



}
