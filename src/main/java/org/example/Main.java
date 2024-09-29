package org.example;

import org.example.Classes.*;
import org.example.Classes.Module;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mark mark1 = new Mark();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        Group g1 = new Group("123","43", students);
        University u = new University("uni1","hawhaw","berkan");
        Administration admin = new Administration();
        Module m1 = new Module("web", "154");
        Module m2 = new Module("base", "3312");
        modules.add(m1);
        Program p1 = new Program("big btata", "informatique", modules);
        Student s1 = admin.createStudent("1111","1515","hamza","hkim",25,true,p1, mark1);
        Student s2 = admin.createStudent("2222","1221","saad","hehe",26,false,p1, new Mark());




        mark1.addStudentMarks(m1, 12);
        mark1.addStudentMarks(m2, 14);

        s2.showStudentMarks();

//
//        admin.addStudent(s1,g1);
//        admin.addStudent(s2,g1);
//        admin.updateStudent("2222", students, "soso", "hoho","1212",31,p1, false);
//        admin.showStudents(students);
        //System.out.println("Student after delete");
       // admin.deleteStudent("1111",students);
        //admin.showStudents(students);





    }
}