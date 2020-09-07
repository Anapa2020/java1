package ru.progwards.java1.lessons.test;

public class Person {
    String name;
    int age;
    String country = "RU";

    public Person(String name,int age){
        this.country = "RU";
        this.name=name;
        this.age=age;
    }

    public Person() {
        getName();
        getAge();
        getCountry();
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }

}
