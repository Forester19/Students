package com.company;

import java.util.ArrayList;

public class GroupOfStudents {

    Student stud0;
    Student stud1;
    Student stud2;
    Student stud3;

    String cap;

    public void SelectToCaptain() {
        stud0.ToBEOnLesson();
        stud1.ToBEOnLesson();
        stud2.ToBEOnLesson();
        stud3.ToBEOnLesson();
        //stud0.ToBEOnLesson();

        if (stud0.getDiligence() > stud1.getDiligence()) {
            cap = stud0.getName();
            if (stud1.getDiligence() > stud2.getDiligence()) {
                cap = stud1.getName();
                if (stud2.getDiligence() > stud3.getDiligence()) {
                    cap = stud2.getName();
                } else cap = stud3.getName();
            } else {
                cap = stud2.getName();
            }
        } else {
            cap = stud1.getName();
        }
        System.out.println("the captein is " + cap);
    }


    public GroupOfStudents(Student stud0, Student stud1, Student stud2, Student stud3) {
        this.stud0 = stud0;
        this.stud1 = stud1;
        this.stud2 = stud2;
        this.stud3 = stud3;


    }
}




