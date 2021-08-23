package academy.devdojo.jiraya.javacore.interfaces.models;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from database...");        
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");        
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on the database...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Maximum data size (classe): " + DatabaseLoader.MAX_DATA_SIZE);
    }
}
