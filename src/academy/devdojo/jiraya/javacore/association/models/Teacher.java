package academy.devdojo.jiraya.javacore.association.models;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
