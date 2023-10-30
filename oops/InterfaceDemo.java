package com.oops;

interface i1
{
    int i=0;
     void show();
    default void display()
    {
        System.out.println("jneslkd");
    }
}

public class InterfaceDemo implements i1{
    public void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {
        i1 ob=new InterfaceDemo();
        ob.display();

    }
}
