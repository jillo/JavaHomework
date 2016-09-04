package com.csdisco.qa;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //turning a string into an int
        int n = Integer.parseInt("-3");

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println (i);    // “i” will be incremented by 1 after print statement
            }
        }

        if (n < 1) {
            for (int i = 1; i >= n; i--) {
                System.out.println (i);    // “i” will be decremented by 1 after print statement
            }
        }



    }
}
