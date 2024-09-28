package org.example;

import org.example.Classes.*;
import org.example.Classes.Module;

import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Module> modules = new ArrayList<>();

        University u = new University("uni1","hawhaw","berkan");
        Administration admin = new Administration();
        Module m1 = new Module("1554", "web");
        modules.add(m1);
        Program p1 = new Program("big btata", "informatique", modules);
        Student s1 = admin.createStudent("1111","1515","hamza","hkim",25,true,p1);
        Student s2 = admin.createStudent("2222","1221","saad","hehe",26,false,p1);

        ArrayList<Student> students = new ArrayList<>();



        admin.addStudent(s1,students);
        admin.addStudent(s2,students);
        admin.updateStudent("2222", students, "soso", "hoho","1212",31,p1, false);
        admin.showStudents(students);
        //System.out.println("Student after delete");
       // admin.deleteStudent("1111",students);
        //admin.showStudents(students);





    }
}