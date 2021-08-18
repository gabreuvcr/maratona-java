package academy.devdojo.jiraya.javacore.finalmodifier.main;

import academy.devdojo.jiraya.javacore.finalmodifier.models.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car("Audi");

        System.out.println(car.getName());
        System.out.println(Car.LIMIT_SPEED);
    }
}
