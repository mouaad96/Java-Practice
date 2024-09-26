package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Module> modules = new ArrayList<>();

        University u = new University("uni1","hawhaw","berkan");

        Module m1 = new Module("1554", "web");
        modules.add(m1);
        Program p1 = new Program("big btata", "informatique", modules);
        Student s1 = new Student("1544",false,p1,"1544","mouad","samati",35);

        System.out.println(s1.toString());
    }
}