package org.example.Classes;

import org.example.Interfaces.Admin;

import java.util.ArrayList;

public final class Administration implements Admin {


    public Student findStudent(ArrayList<Student> students, String cne) {
        for(Student st : students) {
            if(st.getCne().equals(cne)){
                return st;
            }
        }
        return null;
    }

    public Student createStudent(String cne, String cin, String firstName, String lastName, int age , boolean hasScholarShip, Program program ,Mark mark){
        if(age > 30){
            System.out.println("age must be less than 30 for student with cne " + cne);
            return null;
        }
       else
        {
            return new Student(cne,hasScholarShip,program,cin,firstName,lastName,age, mark);
        }
    }

    public  void addStudent(Student student, Group grp) {
        if(student == null){
            return;
        }
        Student foundSt = findStudent(grp.getStudentsList() ,student.getCne());
       if(foundSt != null && foundSt.getCne().equals(student.getCne()))
           System.out.println("already bro");
        else grp.getStudentsList().add(student);
    }


    public  void updateStudent(String cne, ArrayList<Student> students, String newFirstName,String newLastName, String newCin, int newAge, Program newProg, Boolean newScholar) {
        if(newAge > 30){
            System.out.println("no update cause age");
            return;
        }
        Student foundSt = findStudent(students, cne);
            if(foundSt != null){
                foundSt.setCin(newCin);
                foundSt.setFirstName(newFirstName);
                foundSt.setLastName(newLastName);
                foundSt.setRegisteredProgram(newProg);
                foundSt.setHasScholarShip(newScholar);
                foundSt.setAge(newAge);
            }
            else
                System.out.println("cin not found");

    }


    public  void deleteStudent(String cne, ArrayList<Student> students) {
        Student foundSt = findStudent(students, cne);
        if(foundSt != null){
            students.remove(foundSt);

        }
        else {
            System.out.println("no student to delete");
        }
    }


    public  void showStudents(ArrayList<Student> students) {
        for(Student st : students){
            System.out.println(st);
        }
    }
}
