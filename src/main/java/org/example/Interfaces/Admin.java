package org.example.Interfaces;

import org.example.Classes.Program;
import org.example.Classes.Student;

import java.util.ArrayList;

public interface Admin {
      void addStudent(Student student, ArrayList<Student> students);
      Student findStudent(ArrayList<Student> students, String cne);
      void updateStudent(String cne, ArrayList<Student> students, String newFirstName, String newLastName, String newCin, int newAge, Program newProg, Boolean newScholar);
      void deleteStudent(String cne, ArrayList<Student> students);
      void showStudents(ArrayList<Student> students);
}
