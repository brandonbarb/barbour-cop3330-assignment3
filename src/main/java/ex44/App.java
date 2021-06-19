/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

    }

    static void read() throws FileNotFoundException {
        ItemList items = new ItemList();
        File stock = new File("exercise44_input.json");
        Scanner read = new Scanner(stock);
        while (read.hasNextLine()) {
            
        }
    }
}
