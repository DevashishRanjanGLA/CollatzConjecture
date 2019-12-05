package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to find collatz string of: ");
        int number = scanner.nextInt();

        Collatz c = new Collatz();
        System.out.println(number);
        list = c.getCollatzStringForNumber(number);
        int size = list.size();

        for (int i = 0; i < size; i++)
            System.out.println(list.get(i));



    }
}
