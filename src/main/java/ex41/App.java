/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        PersonList people = read();
        people.sort();
        print(people);
    }

    static PersonList read() throws FileNotFoundException { // read file and process, return list of names
        PersonList people = new PersonList(); // initialize list of names
        File file = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) { // reads each name, line by line
            Person input = new Person(read.nextLine());
            people.add(input); // adds the name currently being read to the list of names
        }
        read.close();
        return people; // return list for use in other classes/methods
    }

    static void print(PersonList people) throws IOException { // print output into file
        FileWriter writer = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        writer.write(people.out()); // write output string to output file
        writer.close();
    }
}
