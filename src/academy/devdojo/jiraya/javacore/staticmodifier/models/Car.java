package academy.devdojo.jiraya.javacore.staticmodifier.models;

public class Car {
    private String name;
    private double maxSpeed;
    public static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Limit speed: " + Car.limitSpeed);
        System.out.println();
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
