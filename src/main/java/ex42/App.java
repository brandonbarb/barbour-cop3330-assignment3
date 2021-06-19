/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        PersonList people = read();
        out();
    }

    static PersonList read() throws FileNotFoundException { // read file and process, return list of names
        PersonList people = new PersonList(); // initialize list of names
        File file = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) { // reads each name, line by line
            Person input = new Person(read.nextLine());
            people.add(input); // adds the string currently being read to the list of names
        }
        read.close();
        return people; // return list for use in other classes/methods
    }

    static void out() { // creates output string and prints
        System.out.println("%10Last%10First%10Salary\n--------------------------\n");
        //for (Person person:list) {
        //    System.out.printf("%10s%10s%10s\n", person.first, person.last, person.salary);
        //}
    }
}
