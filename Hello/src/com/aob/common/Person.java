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
        return "My name is " + this.name+";";
    }
}
