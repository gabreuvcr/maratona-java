package academy.devdojo.jiraya.javacore.interfaces.models;

public class FileLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Loading data from file");        
    }
}
