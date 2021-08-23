package academy.devdojo.jiraya.javacore.interfaces.models;

public class DatabaseLoader implements DataLoader {
    
    @Override
    public void load() {
        System.out.println("Loading data from database...");        
    }
}
