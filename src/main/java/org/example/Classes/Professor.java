package org.example.Classes;

import java.util.ArrayList;

public class Professor extends Person {
    private String id;
    private ArrayList<Program> programs;

    public Professor(String id, ArrayList<Program> programs, String cin, String firstName, String lastName, int age) {
        super(cin, firstName, lastName, age);
        this.id = id;
        this.programs = programs;
    }


    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
