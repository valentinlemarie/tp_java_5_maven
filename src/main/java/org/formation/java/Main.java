package org.formation.java;


import java.util.Scanner;

public class Main {


    final static String WORD_TO_QUIT = "=";


    /*
            @param
            args:  program   arguments
    */
    public static void main(String args[]) {
        Calculatrice calculatrice= new Calculatrice();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your operation and press Enter, ends with \"quit\" ");
        boolean stop = false;
        String inputStr = null;
        while (!stop) {
            if (keyboard.hasNextLine()) {
                inputStr = keyboard.nextLine();
                if (WORD_TO_QUIT.equals(inputStr)) {
                    stop = true;
                } else {
                    calculatrice.Calculer(inputStr);
                }
            }
        }

    }
}

