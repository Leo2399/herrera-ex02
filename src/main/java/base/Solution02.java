/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution02 {
    /*
    print "What is the input string?"
     'name' = read string from user

     'nameLength' = count the number of characters in the string

     print "'name' has 'nameLength' characters"
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        String name = input.nextLine();

        int nameLength = name.length();

        System.out.println(name + " has " + nameLength + " characters");
    }
}