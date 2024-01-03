package org.example.set;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with some days of the week
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        System.out.println("Weekend days: " + weekend);

        // Adding a single day to the EnumSet
        weekend.add(Day.FRIDAY);
        System.out.println("Extended weekend days: " + weekend);

        // Creating an EnumSet of all days
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days of the week: " + allDays);

        // Creating an EnumSet of working days (complement of weekend)
        EnumSet<Day> workingDays = EnumSet.complementOf(weekend);
        System.out.println("Working days: " + workingDays);
    }
}

