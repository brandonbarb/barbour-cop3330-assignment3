/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex42;

class Person {
    String first;
    String last;
    String salary; // initialize properties

    Person(String str) {
        String[] splitter = new String[3];
        int count = 0;
        for (int i = 0; i <= str.length(); i++) {
            char c = str.charAt(i);
            if (c != ',') {
                splitter[count] += c;
            } else {
                count++;
            }
        }
        this.first = splitter[0];
        this.last = splitter[1];
        this.salary = splitter[2];
    }
}

