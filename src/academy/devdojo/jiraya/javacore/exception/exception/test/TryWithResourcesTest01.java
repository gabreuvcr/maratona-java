package academy.devdojo.jiraya.javacore.exception.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import academy.devdojo.jiraya.javacore.exception.exception.domain.Reader1;
import academy.devdojo.jiraya.javacore.exception.exception.domain.Reader2;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader1 reader1 =  new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
