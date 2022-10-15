package ru.skvortsov.gb.exceptions.task3.hw;

import java.util.ArrayList;
import java.util.List;

/*
Форматы данных:
фамилия, имя, отчество - строки

дата_рождения - строка формата dd.mm.yyyy

номер_телефона - целое беззнаковое число без форматирования

пол - символ латиницей f или m.
 */
public class Questionnaire {
    private String firstName;
    private String secondName;
    private String lastName;
    private String birthDay;
    private long phoneNumber;
    private String gender;

    private final CheckQuestionnaireForm checker = new CheckQuestionnaireForm();
    private final FileManager fileManager = new FileManager();

    public Questionnaire(String form) {
        List<Questionnaire> listQuestionnaire = new ArrayList<>();

        String[] arrForm = form.split(" ");
        if (checker.checkForm(arrForm)){
            this.firstName = arrForm[0];
            this.secondName = arrForm[1];
            this.lastName = arrForm[2];
            this.birthDay = arrForm[3];
            this.phoneNumber = Long.parseLong(arrForm[4]);
            this.gender = arrForm[5];
            System.out.println("Объект создан");
        }

        fileManager.writeInFile(arrForm);
        listQuestionnaire.add(this);
    }



}
