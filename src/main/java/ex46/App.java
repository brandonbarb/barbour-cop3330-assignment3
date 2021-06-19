/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws IOException {
        String text = read();
        String str1 = "badger";
        String str2 = "mushroom";
        String str3 = "snake";
        int badger = wordCount(text, str1);
        int mushroom = wordCount(text, str2);
        int snake = wordCount(text, str3);
        print(badger, mushroom, snake, str1, str2, str3); // formats and prints number of *s
    }

    static String read() throws IOException { // reads file and returns string
        File file = new File("src/main/java/ex46/exercise46_input.txt");
        String text = "";
        BufferedReader read = new BufferedReader(new FileReader(file)); // read file and add contents to a string
        String line = read.readLine();
        while (line != null) {
            text = text + line + System.lineSeparator();
            line = read.readLine();
        }
        read.close();
        return text;
    }

    static int wordCount(String text, String word) { // counts number of times a word is found in the string
        int count = 0;
        Pattern pattern = Pattern.compile(word); // set word to look for
        Matcher match = pattern.matcher(text); // check for matches
        while(match.find()) {
            count++;
        }
        return count;
    }

    static void print(int badger, int mushroom, int snake, String str1, String str2, String str3) {
        if ((badger > mushroom) && (badger > snake)) { // compares counts and organizes strings accordingly
            System.out.printf("%-10s", str1 + ":");
            for (int i = 0; i <= badger - 1; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            if (mushroom > snake) {
                System.out.printf("%-10s", str2 + ":");
                for (int i = 0; i <= mushroom - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                System.out.printf("%-10s", str3 + ":");
                for (int i = 0; i <= snake - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else {
                str2 = "snake";
                System.out.printf("%-10s", str2 + ":");
                for (int i = 0; i <= snake - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                str3 = "mushroom";
                System.out.printf("%-10s", str3 + ":");
                for (int i = 0; i <= mushroom - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if ((mushroom > badger) && (mushroom > snake)) {
            str1 = "mushroom";
            System.out.printf("%-10s", str1 + ":");
            for (int i = 0; i <= mushroom - 1; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            if (badger > snake) {
                str2 = "badger";
                System.out.printf("%-10s", str2 + ":");
                for (int i = 0; i <= badger - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                System.out.printf("%-10s", str3 + ":");
                for (int i = 0; i <= snake - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                str2 = "snake";
                System.out.printf("%-10s", str2 + ":");
                for (int i = 0; i <= snake - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                str3 = "badger";
                System.out.printf("%-10s", str3 + ":");
                for (int i = 0; i <= badger - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else {
            str1 = "snake";
            System.out.printf("%-10s", str1 + ":");
            for (int i = 0; i <= snake - 1; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            if (badger > mushroom) {
                str2 = "badger";
                System.out.printf("%-10s", str2 + ":");
                for (int i = 0; i <= badger - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                str3 = "mushroom";
                System.out.printf("%-10s", str3 + ":");
                for (int i = 0; i <= mushroom - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else {
                System.out.printf("%-10s", str2 + ":");
                for (int i = 0; i <= mushroom - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                str3 = "badger";
                System.out.printf("%-10s", str3 + ":");
                for (int i = 0; i <= badger - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
