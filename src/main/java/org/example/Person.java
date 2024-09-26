package org.example;

public abstract class Person {
    protected String cin;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected  enum  nationality {MOROCCAN , FOREIGNER};

    public Person(String cin, String lastName, String firstName, int age) {
        this.cin = cin;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
