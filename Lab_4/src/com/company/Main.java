package com.company;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stackuch= new Stack<>();
        int cntStrings = 0,lngString = 0;
        try{
            BufferedReader bReader = new BufferedReader(new FileReader("test1.txt"));
            String line=bReader.readLine();
            while (line!=null){
                cntStrings++;
                if (lngString<line.length()){
                    lngString=line.length();
                }
                stackuch.push(line);
                line=bReader.readLine();
            }
            bReader.close();
            BufferedWriter bWriter = new BufferedWriter(new FileWriter("test1.txt"));
            while (!stackuch.empty()){
                bWriter.write(stackuch.pop() + "\n");
            }
            bWriter.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество строк в документе: " + cntStrings);
        System.out.println("Количество символов в самой длинной строке: " + lngString);
    }
}
