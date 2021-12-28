package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class PersonDemo {
    public static void demo(){
        Person pers = new Person("Кто-то", "Иванов", 100, 55555);
        PersonPrinter.printInfo(pers);
        pers.setAge(pers.getAge() + 1); // др
        PersonPrinter.printInfo(pers);

        System.out.println("");

        Student student = new Student("Какой-то", "Зябликов", 50, 666666, 20, 76);
        StudentPrinter.printInfo(student);
        student.setGroup(42); //
        StudentPrinter.printInfo(student);
    }
}
