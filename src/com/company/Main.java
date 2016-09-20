package com.company;

/**
 * Created by Владислав on 19.09.2016.
 */
public class Main {

    public static void main(String[] args) {
        Professor p = new Professor("Yeshov", 70, 100);
        System.out.println("Teacher " + p.getName() + " ready");
        p.WhoArePresent();


        GroupOfStudents groupOfStudents = new GroupOfStudents(new Student("fa", 19, 50),
                new Student("fi", 19, 23),
                new Student("fo", 19, 90),
                new Student("fu", 19, 60));

        groupOfStudents.SelectToCaptain();
    }
}
