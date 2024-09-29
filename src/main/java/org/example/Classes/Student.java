package org.example.Classes;


public class Student extends Person {
    private String cne;
    private boolean hasScholarShip;
    private Program registeredProgram;
    private Mark mark;

    public Student(String cne, boolean hasScholarShip, Program registeredProgram, String cin, String firstName, String lastName, int age, Mark mark) {
        super(cin, firstName, lastName, age);
        this.cne = cne;
        this.hasScholarShip = hasScholarShip;
        this.registeredProgram = registeredProgram;
        this.mark = mark;
    }
    public Student(){
        super();
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public boolean isHasScholarShip() {
        return hasScholarShip;
    }

    public void setHasScholarShip(boolean hasScholarShip) {
        this.hasScholarShip = hasScholarShip;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public  void showStudentMarks(){
        if (mark == null || mark.getStudentMarks() == null || mark.getStudentMarks().isEmpty()) {
            System.out.println("No student marks available.");
            return;  // Exit the method early
        }
        System.out.println("Student: " + getFirstName() + " " + getLastName());
        for (Module i : mark.getStudentMarks().keySet()) {
            System.out.println("module Name: " + i.getModuleName() + " mark: " + mark.getStudentMarks().get(i));
        }

        mark.getStudentResult();
    }

    public Program getRegisteredProgram() {
        return registeredProgram;
    }

    public void setRegisteredProgram(Program registeredProgram) {
        this.registeredProgram = registeredProgram;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cne='" + cne + '\'' +
                ", hasScholarShip=" + isHasScholarShip() +
                ", registeredProgram=" + getRegisteredProgram().getName() +
                ", cin='" + cin + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }





}
