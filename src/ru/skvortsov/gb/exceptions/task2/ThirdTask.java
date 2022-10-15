package ru.skvortsov.gb.exceptions.task2;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) throws Exception {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
        }
            printSum(23, 234);
        try {
            int[] abc = {1, 2};
            abc[1] = 9;
            System.out.println(Arrays.toString(abc));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Неверный индекс!");
        }
    }
    public static void printSum(Integer a, Integer b) throws IllegalArgumentException{
        System.out.println(a + b);
    }
}
