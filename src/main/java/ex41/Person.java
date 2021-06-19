/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex41;

class Person implements Comparable<Person> {
    String name;
    Person(String name) {
        this.name = name;
    } // assign property

    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}
