package academy.devdojo.jiraya.javacore.interfaces.main;

import academy.devdojo.jiraya.javacore.interfaces.models.DataLoader;
import academy.devdojo.jiraya.javacore.interfaces.models.DatabaseLoader;
import academy.devdojo.jiraya.javacore.interfaces.models.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
