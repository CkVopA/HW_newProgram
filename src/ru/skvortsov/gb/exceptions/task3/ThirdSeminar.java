package ru.skvortsov.gb.exceptions.task3;

public class ThirdSeminar {
    public static void main(String[] args) {
        try (Counter counter = new Counter()){
           counter.add();
        } catch (Exception e) {
            e.printStackTrace();
        }






        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("Исключение");
        }
    }

    public static void doSomething() throws RuntimeException{
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
