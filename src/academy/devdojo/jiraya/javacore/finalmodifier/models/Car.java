package academy.devdojo.jiraya.javacore.finalmodifier.models;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250;
    
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
