/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex41;

import java.util.ArrayList;
import java.util.Collections;

class PersonList {
    ArrayList<Person> list;
    PersonList() {
        this.list = new ArrayList<Person>();
    }

    void sort() { // sorts list of names alphabetically
        Collections.sort(this.list);
    }

    void add(Person input) {
        list.add(input);
    }

    String out() { // creates output string
        String out = "Total of " + list.size() + " names\n-----------------\n";
        for (Person person:list) {
            out += person.name + "\n";
        }
        return out;
    }
}
