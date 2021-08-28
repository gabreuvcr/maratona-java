package academy.devdojo.jiraya.javacore.exception.exception.main;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) { 
        try {
            createNewFile();
        } catch (IOException e) {
            System.out.println("Problem creating the file");
        }
    }

    private static void createNewFile() throws IOException {
        File file = new File("filles\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
