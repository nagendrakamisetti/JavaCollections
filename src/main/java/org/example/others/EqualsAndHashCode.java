package org.example.others;

import java.util.HashMap;
import java.util.Map;

class EqualsAndHashCode {
    public static void main(String[] args) {
        Map<Person, String> personMap = new HashMap<>();

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Alice", 25);

        personMap.put(person1, "Engineer");
        personMap.put(person2, "Doctor");

        personMap.forEach((key, value) -> {
            System.out.println("Key: "+key);
            System.out.println("Value: " +value);
        });
        // Since person3 has the same name and age as person1, it should retrieve the value associated with person1
        String profession = personMap.get(person3);
        System.out.println("Profession: " + profession); // Output: Profession: Engineer
    }
}

