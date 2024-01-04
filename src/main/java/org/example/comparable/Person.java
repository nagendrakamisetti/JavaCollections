package org.example.comparable;

import lombok.Data;

@Data
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare persons based on their ages
        return Integer.compare(this.age, otherPerson.age);
    }
}
