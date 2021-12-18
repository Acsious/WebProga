package com.example.lab_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.String;

public class CounterBean {
    private String path="/count.txt"; // Полный путь к файлу
    private String write; // Что записать в файл
    private String read; // содержимое, прочитанное из файла

    public CounterBean(){}

    public int readFile () {// Чтение содержимого из файла
        try {
            FileReader freader = new FileReader(path);
            BufferedReader breader = new BufferedReader(freader);
            read = breader.readLine();
            breader.close();
            freader.close();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public int writeOver () {// Записать содержимое в файл (write), исходное содержимое будет смыто
        try {
            FileWriter fwriter = new FileWriter(path);
            BufferedWriter bwrite = new BufferedWriter(fwriter);
            bwrite.write(write, 0, write.length());
            bwrite.flush();
            bwrite.close();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public int writeAppend () {// Добавить содержимое записи в файл (запись), на этот раз этот метод не используется
        try {
            FileWriter fwrite = new FileWriter(path);
            BufferedWriter bwrite = new BufferedWriter(fwrite);
            bwrite.newLine();
            bwrite.write(write, 0, write.length());
            bwrite.flush();
            bwrite.close();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getWrite() {
        return write;
    }
    public void setWrite(String write) {
        this.write = write;
    }
    public String getRead() {
        return read;
    }
    public void setRead(String read) {
        this.read = read;
    }
}
