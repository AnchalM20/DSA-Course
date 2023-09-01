package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("arya");
        name.add("shreya");
        name.add("riya");
        Iterator<String> itr = name.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next().toUpperCase());
        }
    }
}
