package ru.skvortsov.gb.exceptions.task3.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    File files_DIR = new File("src/ru/skvortsov/gb/exceptions/task3/hw/files_questionnaire");
    File file;

    public void writeInFile(String[] form){
        System.out.println("Зашли в запись");
        try(FileWriter writer = new FileWriter(checkAndCreateFileByName(form[0]), true)) {
            System.out.println("проверили");
            for (int i = 0; i < form.length; i++) {
               writer.write(form[i]+ " ");
           }
            // запись по символам
            writer.append('\n');
            writer.flush();
            System.out.println("Записали");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public File checkAndCreateFileByName(String fileName) {
        System.out.println("Проверяем наличие файла");
        file = new File(files_DIR, fileName + ".txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
