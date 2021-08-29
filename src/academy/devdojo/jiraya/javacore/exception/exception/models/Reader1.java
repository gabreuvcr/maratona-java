package academy.devdojo.jiraya.javacore.exception.exception.models;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Reader1 closed");        
    }
}
