/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex43;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String name; String author; String java; String css;
        Scanner input = new Scanner(System.in);

        System.out.print("Site name: ");
        name = input.next();
        System.out.print("Author: ");
        author = input.next();
        System.out.print("Do you want a folder for JavaScript? ");
        java = input.next();
        System.out.print("Do you want a folder for CSS? ");
        css = input.next();

        FileGen.siteName(name);
        FileGen.author(author, name);
        FileGen.javaScript(java, name);
        FileGen.css(css, name);
    }
}
