package com.sunbeam;

import java.util.ArrayList;
public class Program {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana"); 
        items.add("Cherry");

        System.out.println("Original list: " + items);
        String specifiedElement = "Blueberry";
        items.set(1, specifiedElement);
        System.out.println("Updated list: " + items);
    }
}