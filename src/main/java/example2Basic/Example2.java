package example2Basic;
import java.util.Scanner;
/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Richard Pekarski
 */
public class Example2 {
    public static void main(String[] args)
    {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print(name + " has " + name.length() + " characters.");
    }
}
