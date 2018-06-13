package com.company.statics.intro;

public class Main {

    /**
     * static
     * binary search
     *
     */

    public static void main(String[] args) {

        Person p1 = new Person("A");
        Person p2 = new Person("B");

        p1.setClassIdentifier("Person");
        System.out.println("" + p1 + " " + p1.getClassIdentifier());
        System.out.println("" + p2 + " " + p2.getClassIdentifier());
    }
}

class Person {
    static String classIdentifier;
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void setClassIdentifier(String s) {
        classIdentifier = s;
    }

    public String getClassIdentifier() {
        return classIdentifier;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
