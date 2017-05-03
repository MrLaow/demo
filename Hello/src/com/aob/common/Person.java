package com.aob.common;

/**
 * Created by Windows User on 2017/5/3.
 */
public class Person {

    private String name ;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("My name is " + this.name+";");
        System.out.println("My name is " + this.name+";;");
        return "My name is " + this.name+";";
    }
}
