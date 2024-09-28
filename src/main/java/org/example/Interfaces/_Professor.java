package org.example.Interfaces;

import org.example.Classes.Professor;
import org.example.Classes.Student;

import java.util.ArrayList;

public interface _Professor {
    public void addProfessor(_Student student);
    public Professor findProfessor(ArrayList<Professor> professors, String cne);
    public void updateProfessor(String cne);
    public void deleteProfessor(String cne);
    public void showProfessor();
}
