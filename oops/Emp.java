package com.oops;

class Person {
    String Name;
    String Degs;

    public void get() {
        Name = "Manish kumar";
        Degs = "Software Engineer";
    }

    public void display() {
        System.out.println("Name=" + Name);
        System.out.println("Degs=" + Degs);
    }
}

class Emp extends Person {
    int sal;

    public void set() {
        sal = 75000;
    }

    public void show() {
        System.out.println("Salary: " + sal);
    }

    public static void main(String[] args) {
        Emp e = new Emp();
        e.get();
        e.set();
        e.display();
        e.show();
    }
}
