package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Hello "+name+','+" I see you are "+age+" years old!");
    }
}
