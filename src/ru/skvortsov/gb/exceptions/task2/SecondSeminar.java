package ru.skvortsov.gb.exceptions.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondSeminar {
    public static void main(String[] args) {
sumOfArray();
    }

    public static int giveMeSomething() {
        System.out.println("Введи пароль, друг");
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        while (true){
            try {
                x = scanner.nextInt();
                return x;
            } catch (InputMismatchException e){
                System.out.println("Не то!");
                String line = scanner.nextLine();
            }
        }
    }

    public static void sumOfArray(){
        String[][] arr = new String[10][];
        int sum = 0;
        for (String[] strings : arr) {
            for (int j = 0; j < 5; j++) {
                try {
                    int val = Integer.parseInt(strings[j]);
                    sum += val;
                } catch (NumberFormatException ignored) {
                }
            }
        }
        System.out.println(sum);
    }
}
