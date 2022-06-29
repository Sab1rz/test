package com.sabir.learningfilereader;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        File file=new File("myfile.txt");
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to tread the file");
            System.out.println("There are many");
        }

    }
}
