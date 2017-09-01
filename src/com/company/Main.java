package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        students.add(new Student("James", "Henderson", 100, 1));
        students.add(new Student("Jane", "Miller", 101, 1));
        students.add(new Student("Bobby", "Flay", 102, 1));
        students.add(new Student("Sienna", "Johnson", 103, 1));
        students.add(new Student("Felecia", "Wazowski", 104, 1));
        students.add(new Student("Carl", "Howell", 105, 1));
        students.add(new Student("Simon", "Jennings", 106, 1));
        students.add(new Student("Holly", "Stillwell", 107, 1));
        students.add(new Student("Heather", "Jenkins", 108, 1));
        students.add(new Student("Jason", "Collins", 109, 1));
        students.add(new Student("Paul", "Gladwell", 110, 1));
        students.add(new Student("Gloria", "Falcon", 111, 1));
        students.add(new Student("Pauline", "Jackson", 112, 1));
        students.add(new Student("Gregory", "Jacobs", 113, 1));
        students.add(new Student("Noelle", "Sanderson", 114, 1));



        teachers.add(new Teacher("Gladys", "Phillips", 1000, 1));
        teachers.add(new Teacher("Terrance", "Butler", 1001, 1));
        teachers.add(new Teacher("Sarah", "Pendergrass", 1002, 1));


        HashSet<Student> set1 = new HashSet<>();
        HashSet<Student> set2 = new HashSet<>();
        HashSet<Student> set3 = new HashSet<>();

        set1.add(students.get(0));
        set1.add(students.get(1));
        set1.add(students.get(2));
        set1.add(students.get(3));
        set1.add(students.get(4));

        set2.add(students.get(5));
        set2.add(students.get(6));
        set2.add(students.get(7));
        set2.add(students.get(8));
        set2.add(students.get(9));

        set3.add(students.get(10));
        set3.add(students.get(11));
        set3.add(students.get(12));
        set3.add(students.get(13));
        set3.add(students.get(14));



        HashMap<Teacher, HashSet> studentAssignment = new HashMap<>();

        studentAssignment.put(teachers.get(0), set1);
        studentAssignment.put(teachers.get(1), set2);
        studentAssignment.put(teachers.get(2), set3);


        System.out.println(studentAssignment);

        for(Teacher teacher : studentAssignment.keySet()) {
            System.out.println(teacher);
        }

        for(HashSet setOfStudents: studentAssignment.values()) {
            System.out.println(setOfStudents);
        }








    }

}