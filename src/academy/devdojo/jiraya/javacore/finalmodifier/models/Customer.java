package academy.devdojo.jiraya.javacore.finalmodifier.models;

public class Customer {
    private String name;

    @Override
    public String toString() {
        return "Comprador: " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
