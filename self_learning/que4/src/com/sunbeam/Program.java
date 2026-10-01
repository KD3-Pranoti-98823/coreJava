package com.sunbeam;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

 
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }


    public boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;
    }
}

public class Program {
    public static void main(String[] args) {

        Day day = Day.SATURDAY;

        System.out.println("Day: " + day);

        System.out.println("Is Weekend? " + day.isWeekend());

        System.out.println("Is Weekday? " + day.isWeekday());
    }
}