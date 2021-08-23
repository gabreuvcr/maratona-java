package academy.devdojo.jiraya.javacore.interfaces.models;

public interface DataLoader {
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking permissions...");
    }
}
