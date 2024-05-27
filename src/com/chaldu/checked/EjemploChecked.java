package com.chaldu.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploChecked {
    public static void main(String[] args) {
        try {
            readFile("productos.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
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
