package org.example.Interfaces;

import org.example.Classes.Mark;
import org.example.Classes.Program;
import org.example.Classes.Student;

import java.util.ArrayList;

public interface Admin {
      public Student findStudent(ArrayList<Student> students, String cne);
      Student createStudent(String cne, String cin, String firstName, String lastName, int age , boolean hasScholarShip, Program program , Mark mark);
      void updateStudent(String cne, ArrayList<Student> students, String newFirstName, String newLastName, String newCin, int newAge, Program newProg, Boolean newScholar);
      void deleteStudent(String cne, ArrayList<Student> students);
      void showStudents(ArrayList<Student> students);

}
