package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner human = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = human.nextLine();
        System.out.println("Hello " + name );

    }
}
