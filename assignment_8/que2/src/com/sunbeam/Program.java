package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
public class Program {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Original list: " + colors);
        Collections.sort(colors);
        System.out.println("Sorted list: " + colors);
    }
}
