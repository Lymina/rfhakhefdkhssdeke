package com.samsung.service;

import com.samsung.model.Person;

public interface Printer {
    static void printInfo(Person p){
        System.out.println(p.toString());
    }
}
