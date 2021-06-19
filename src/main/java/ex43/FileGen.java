/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileGen {
    static void siteName(String name) throws IOException {
        File nameFile = new File("src/main.java/ex43/.website/" + name);
        if (nameFile.createNewFile()) {
            System.out.printf("Created ./website/%s", name);
        }
    }

    static void author(String author, String name) throws IOException {
        File index = new File("./website/" + name + "/index.html", name);
        FileWriter writer = new FileWriter("./website/" + name + "/index.html");
        index.createNewFile();
        writer.write("");
        writer.close();
        System.out.printf("Created ./website/%s/index.html", name);
    }

    static void javaScript(String java, String name) {
        if (java.equals("y")) {
            File js = new File("./website/" + name + "/js/");
            System.out.printf("Created ./website/%s/js/", name);
        }
    }

    static void css(String css, String name) {
        if (css.equals("y")) {
            File cssfile = new File("./website/" + name + "/css/");
            System.out.printf("Created ./website/%s/css/", name);
        }
    }
}
