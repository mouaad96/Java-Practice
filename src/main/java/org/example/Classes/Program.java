package org.example.Classes;

import java.util.ArrayList;

public class Program {
    private String name;
    private String fieldOfStudy;
    private ArrayList<Module> modules;

    public Program() {
    }

    public Program(String name, String fieldOfStudy, ArrayList<Module> modules) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }



}
