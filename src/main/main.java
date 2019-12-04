package main;

import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to find collatz string of: ");
        int number = scanner.nextInt();
        Collatz c = new Collatz();
        System.out.println(c.getCollatzStringForNumber(number));
    }
}
