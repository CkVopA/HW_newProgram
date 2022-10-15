package ru.skvortsov.gb.exceptions.task3.hw;

import ru.skvortsov.gb.exceptions.task3.hw.myIoExceptions.MyIO_WrongFormatGenderException;
import ru.skvortsov.gb.exceptions.task3.hw.myIoExceptions.MyIO_WrongNumberFormatException;
import ru.skvortsov.gb.exceptions.task3.hw.myIoExceptions.MyIO_WrongFormatDateException;

import java.util.List;

public class CheckQuestionnaireForm {

    private List<String> formUser;
    private String[] arrForm;

    protected boolean checkForm(String[] arr){
        arrForm = arr;
        checkCountElements();
        return checkFormatForm(arrForm);
    }

    private void checkCountElements() {
        if (arrForm.length < 6){
            throw new IndexOutOfBoundsException("Вы ввели недостаточно данных!");
        }
        if (arrForm.length > 6){
            throw new IndexOutOfBoundsException("Вы ввели слишком много данных!");
        }
    }

    private boolean checkFormatForm(String[] arrForm) {
        return checkFormatFullName(arrForm) && checkFormatBirthday(arrForm[3]) &&
                checkFormatPhoneNumber(arrForm[4]) && checkFormatGender(arrForm[5]);
    }

    private boolean checkFormatFullName(String[] arrForm){        // проверка формата ФИО, буквы ли там...
//        if(){
//
//        } else throw new MyIO_NotTextException();
        return true;
    }

    private boolean checkFormatBirthday(String birthForm){        // проверка формата Даты рождения, цифры, точки...
        String[] arrDate = arrForm[3].split("\\.");
        if (arrDate.length != 3){
            throw new MyIO_WrongFormatDateException();
        }
        /*
         тут надо более конкретно обрабатывать значения, потому что могут вводить значения с нулём (03,09...)
         */
        if (Integer.parseInt(arrDate[0]) < 0 || Integer.parseInt(arrDate[0]) > 31){
            throw new MyIO_WrongFormatDateException();
        }
        return true;
    }

    private boolean checkFormatPhoneNumber(String numberForm){     // проверка формата телефона - состоит только из цифр
        if (numberForm.length() < 10 || numberForm.length() > 11){
            throw new MyIO_WrongNumberFormatException("В номере телефона должно быть 10-11 цифр!");
        }
        try {
            long phone = Long.parseLong(numberForm);
            return true;
        }catch (MyIO_WrongNumberFormatException e){
            throw new MyIO_WrongNumberFormatException("В номере телефона доступны только цифры!");
        }
    }

    private boolean checkFormatGender(String genderForm){            // проверка формата пола
        if (genderForm.equals("М") || genderForm.equals("м") || genderForm.equals("Ж") || genderForm.equals("ж")){
            return true;
        }else throw new MyIO_WrongFormatGenderException("Указать пол кирилицей буквами: М - мужчина, Ж - женщина");
    }
}

