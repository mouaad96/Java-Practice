package org.example.Classes;

import java.util.ArrayList;
import java.util.HashMap;

public  class Mark {
    private Student student;
    private ArrayList<Module> modules;
    private HashMap<Module, Double> studentMarks = new HashMap<Module, Double>();
    private double result;



    public Mark(Student student, ArrayList<Module> modules, HashMap<Module, Double> studentMarks, double result) {
        this.student = student;
        this.modules = modules;
        this.studentMarks = studentMarks;
        this.result = result;
    }

    // methods
    //add
    public void addStudentMarks(Module module, double mark){
        studentMarks.put(module,mark);
    }

    public void getStudentResult(){
        double mark = 0;
        double nbModules = 0;
        for(Module module : studentMarks.keySet()){
            mark += studentMarks.get(module);
            nbModules++;
        }

        System.out.println("the result: " + mark / nbModules);

    }



    public Mark(){}

    public Student getCne() {
        return student;
    }

    public void setCne(Student student) {
        this.student = student;
    }

    public ArrayList<Module> getIdModule() {
        return  modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public HashMap<Module, Double> getStudentMarks() {
        return studentMarks;
    }

    public void SetStudentMarks(HashMap<Module, Double> studentMarks) {
        this.studentMarks = studentMarks;
    }

    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }

}
