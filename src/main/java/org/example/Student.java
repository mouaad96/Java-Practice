package org.example;

public class Student extends Person {
    private String cne;
    private boolean hasScholarShip;
    private Program registeredProgram;

    public Student(String cne, boolean hasScholarShip, Program registeredProgram, String cin, String firstName, String lastName, int age) {
        super(cin, firstName, lastName, age);
        this.cne = cne;
        this.hasScholarShip = hasScholarShip;
        this.registeredProgram = registeredProgram;
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
                ", hasScholarShip=" + hasScholarShip +
                ", registeredProgram=" + registeredProgram.getName() +
                ", cin='" + cin + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
