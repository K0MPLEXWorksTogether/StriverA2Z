package Basics.BasicsOfJava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I Know Your Name:");
        String name = scan.next();

        System.out.println("Hello " + name);
        scan.close();
    }
}