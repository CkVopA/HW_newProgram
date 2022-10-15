package ru.skvortsov.gb.exceptions.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLDataException;

/**
 *  1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
 * пользователя ввод данных.
 *
 *  2. Если необходимо, исправьте данный код
 *  (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 *  3. Дан следующий код, исправьте его там, где требуется
 * (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 *  4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class HomeWork_2 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //firstTask();
        //secondTask();

        dontWriteEmpty();
    }

    public static float firstTask() throws IOException {
        System.out.println("Введите дробное число с точкой");
        boolean isFloatNum = false;
        float num = 0;
        while (!isFloatNum){
            try {
                num = Float.parseFloat(reader.readLine());
                isFloatNum = true;
            }catch (NumberFormatException e){
                System.out.println("Вы ввели не то, что требуется! Введите дробное число с точкой!");
            }
        }
        return num;
    }

    public static void secondTask(){
        int d = 0;
        int[] intArray = new int[10];
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
            System.out.println("Catching exception: " + e);
        }
    }

    public static void dontWriteEmpty(){
        try {
            String some = reader.readLine();
            if (some.isBlank()){
                throw new IoEmptyException("Пустые строки вводить нельзя");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
