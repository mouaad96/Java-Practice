package org.example;

import java.util.ArrayList;

public class Group {
    private String id;
    private String name;
    private ArrayList<Student> studentsList;

    public Group(String id, String name, ArrayList<Student> studentsList) {
        this.id = id;
        this.name = name;
        this.studentsList = studentsList;
    }

    public Group() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
