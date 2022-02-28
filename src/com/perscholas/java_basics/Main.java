package com.perscholas.java_basics;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i < 11; i++) {
            System.out.println("Question #1 " + i);
        }

        int whileVariable = 0;
        while(whileVariable <= 100) {
            System.out.println("Question #2 " + whileVariable);
            whileVariable += 10;
        }

        int loopVariable = 1;
        do {
            System.out.println("Question #3 " + loopVariable);
            loopVariable++;
        } while(loopVariable < 11);

        for (int i = 1; i < 101; i++) {
            if(i % 5 == 0) {
                if(i > 25 && i < 76) {
                    continue;
                }
                System.out.println("Question #4 " + i);
            }
        }

        for (int i = 0; i < 101; i++) {
            if(i % 5 == 0) {
                System.out.println("Question #5 " + i);
                if(i == 50) {
                    break;
                }
            }
        }

        for (int i = 1; i < 3; i++) {
            System.out.println("Week " + i + ":");
            for (int j = 1; j < 6; j++) {
                System.out.println("Day " + j);
            }
        }

        
    } // main
} // class
