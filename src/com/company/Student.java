package com.company;

/**
 * Created by Владислав on 17.09.2016.
 */
public class Student extends Person {
    public Student(String name, int age, double diligence) {
        super(name, age, diligence);
    }

    public void ToBEOnLesson() {
        System.out.println("I'm present (" + getName() + ") " + "i'm " + getAge() + " And already to learn on " + getDiligence() + "%");
    }

}
