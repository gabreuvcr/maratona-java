package academy.devdojo.jiraya.javacore.finalmodifier.domain;

public class Customer {
    private String name;

    @Override
    public String toString() {
        return "Customer: " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
