/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex45;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String name = input.next(); // take input of file name
        writeToFile(name, replace());
    }

    static String replace() throws IOException { // reads file, replaces word, returns edited text
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        String oldString = "";
        BufferedReader read = new BufferedReader(new FileReader(file)); // read file and add contents to a string
        String line = read.readLine();
        while (line != null) {
            oldString = oldString + line + System.lineSeparator();
            line = read.readLine();
        }
        read.close();
        return oldString.replaceAll("utilize", "use"); // replace word and return value
    }

    static void writeToFile(String name, String newString) throws IOException { // creates output file and writes edited text
        FileWriter write = new FileWriter("src/main/java/ex45/" + name + ".txt"); // alter file name to include user input
        write.write(newString); // write updated string to created file
        write.close();
    }
}
