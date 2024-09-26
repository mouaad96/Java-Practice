package org.example;

public class Mark {
    private Student cne;
    private Module idModule;
    private double mark;


    public Mark(Student cne, Module idModule, double mark) {
        this.cne = cne;
        this.idModule = idModule;
        this.mark = mark;
    }

    public Mark(){}

    public Student getCne() {
        return cne;
    }

    public void setCne(Student cne) {
        this.cne = cne;
    }

    public Module getIdModule() {
        return idModule;
    }

    public void setIdModule(Module idModule) {
        this.idModule = idModule;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
