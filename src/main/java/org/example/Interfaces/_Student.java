package org.example.Interfaces;

import java.util.ArrayList;

public interface _Student {
    public void addStudent(_Student student);
    public _Student findStudent(ArrayList<_Student> students, String cne);
    public void updateStudent(String cne);
    public void deleteStudent(String cne);
    public void showStudent();
}
