package com.company.statics.ctor;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(); //"this" was created

        person.regularHello();
        person.staticHello();


        Person.staticHello();
        Person.constant = "ccc";
//        Person.regularName;
    }
}

class Person {

    public static void staticHello() {
//        System.out.println(regularName);
    }

    public void regularHello() {
        System.out.println("regular hello");
        System.out.println(constant);

    }


    protected static String constant = "CONSTANT";

    private static String staticName;
    public String regularName;

    //static block - "constructor"
    //Фаза 1
    static {
        System.out.println("static block");
    }

    //Фаза 2

    public Person() {
        System.out.println("constructor");
    }
}
