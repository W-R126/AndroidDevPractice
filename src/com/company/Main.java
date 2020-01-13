package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int size = 0;
        String user_input = null;
        user_input = getString("Please enter a number so we can draw your triangle and diamond: ");

        size = Integer.parseInt(user_input);

        System.out.println(multi_string(size, "*"));
        for(int i = 0; i < size-2; i++){
            System.out.println("*" + multi_string(size -2, " ") + "*");
        }
        System.out.println(multi_string(size, "*"));
        System.out.println(user_input);


//        for(int i=1; i <= size; i++) {
//            for (int v = 1; v <= size; v++) {
//                if(v <= i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

    }

    private static String getString(String prompt) {
        System.out.print(prompt);
        String userInput = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read!");
            System.exit(500);

        }
        return userInput;
    }

    private static String multi_string(int length, String ch) {
        String st = "";
        for (int i = 0; i < length; i++) {
            st += ch;
        }
        return st;
    }

}
