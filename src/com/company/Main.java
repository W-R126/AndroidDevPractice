package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world!");
    }
    private static String getString(String prompt) {
        System.out.print(prompt);
        String userInput = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = br.readLine();
        } catch(IOException ioe) {
            System.out.print("?io error trying to read");
            System.exit(1);

        }
        return userInput;
    }

}
