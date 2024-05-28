package com.chaldu.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploChecked {
    public static void main(String[] args) {
        try {
            readFile("productos2.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continua...");
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
