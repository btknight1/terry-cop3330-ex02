package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String name = input.nextLine();
        int nameLength = name.length();
        System.out.print(name + " has " + nameLength + " characters.");
    }
}
