package ru.skvortsov.gb.exceptions.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,0,1,0,1,1,1,0,1,0,1,1};
        int[] arr2 = new int[]{0,0,1,1,1,1,0,1,0,1,1};
        int[] arr3 = new int[]{1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println(Arrays.toString(element_difference(arr1,arr3)));
        System.out.println(Arrays.toString(element_difference(arr3,arr1)));

        System.out.println(Arrays.toString(element_quotient(arr3, arr1)));
    }

    // 1 задание. 1 метод
    public static int div_to_0(){
        return 1/0;
    }
    // 1 задание. 2 метод
    public static void indexExc(){
        int[] arr = new int[3];
        System.out.println(arr[4]);
    }
    // 1 задание. 3 метод
    public static void excep(){
        throw new RuntimeException();
    }

    public static int indexOfElementArray(int[] arr, int x){
        if (arr == null){
            return -3;
        }
        if (arr.length < 2){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -2;
    }

    public static void meth2(int index){
        if (index==-1){
            System.out.println("Array size less than minimum");
        }
        if (index==-3){
            System.out.println("Array is null");
        }
        if (index==-2){
            System.out.println("Element is not found in array");
        }
        else System.out.println("Index of element = " + index);
    }

    // Task 2
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
    не равны, необходимо как-то оповестить пользователя.
     */
    public static int[] element_difference(int[] ar1, int[] ar2){
        if (ar1.length != ar2.length){
            throw new IndexOutOfBoundsException("Длины массивов не равны!");
        }
        int[] arrNew = new int[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
                arrNew[i] = ar1[i] - ar2[i];
        }
        return arrNew;
    }

    /*
    4) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
     не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
     которое пользователь может увидеть - RuntimeException, т.е. ваше
     */
    public static int[] element_quotient(int[] ar1, int[] ar2){
        if (ar1.length != ar2.length){
            throw new IndexOutOfBoundsException("Длины массивов не равны!");
        }
        int[] arrNew = new int[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
            try {
                arrNew[i] = ar1[i] / ar2[i];
            } catch (RuntimeException e) {
                System.out.println("EXCEPTION");
            }
        }
        return arrNew;
    }

}
