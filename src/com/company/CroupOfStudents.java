package com.company;

import java.util.ArrayList;

public class CroupOfStudents {

    public static void main(String[] args) {



    Professor professor = new Professor("Yakov Fine", 50, 100);
        System.out.println( professor.getName() + "  Say: who is here?"+ "Im ready to teach on " + professor.getDiligence() + "%");


    Student student = new Student("Vlad1", 19, 70);
    Student student1 = new Student("Vlad2", 19, 90);
    Student student2 = new Student("Vlad3", 19, 73);
    Student student3 = new Student("Vlad4", 19, 80);
    Student student4 = new Student("Vlad5", 19, 74);

        ArrayList<Student> students = new ArrayList<>();
        students.add(0,student);
        students.add(1,student1);
        students.add(2,student2);
        students.add(3,student3);
        students.add(4,student4);


        for (int i = 0; i<students.size(); i++){
            students.get(i).ToBEOnLesson();
        }
        String cap;
if (students.get(0).getDiligence() > students.get(1).getDiligence()){
    cap = students.get(0).getName();
    if (students.get(1).getDiligence() >students.get(2).getDiligence()){
        cap = students.get(1).getName();
        if (students.get(2).getDiligence()>students.get(3).getDiligence()){
            cap = students.get(2).getName();
            if (students.get(3).getDiligence()>students.get(4).getDiligence()){
                cap = students.get(3).getName();
            }else {
                cap = students.get(4).getName();
            }
        }else {
            cap = students.get(3).getName();
        }
    }else {
        cap = students.get(2).getName();
    }
}else {
    cap = students.get(1).getName();
}

        System.out.println("The captain of this group is "+ cap+"\n"+"MY CONGRATULATIONS");



    }


    }

