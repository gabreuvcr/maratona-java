package academy.devdojo.jiraya.javacore.finalmodifier.models;

// if Car is final then it cannot be extended
public class Ferrari extends Car {
    
    public Ferrari(String name) {
        super(name);
    }

    // Cannot override the final method from Car 
    // @Override
    // public void print() {} 

}
