package com.company;

/**
 * Created by Владислав on 16.09.2016.
 */
      abstract class Person {
    private String name = "name";
    private int age;
    private int diligence; // max = 100

    public Person(String name, int age, double diligence) {
        this.name = name;
        this.age = age;
        this.diligence = (int) diligence;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getDiligence() {
        return diligence;
    }
}
