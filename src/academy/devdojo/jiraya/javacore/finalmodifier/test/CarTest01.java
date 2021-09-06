package academy.devdojo.jiraya.javacore.finalmodifier.test;

import academy.devdojo.jiraya.javacore.finalmodifier.domain.Car;
import academy.devdojo.jiraya.javacore.finalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car("Audi");

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.getName());
        System.out.println(car.CUSTOMER);
        car.CUSTOMER.setName("Kuririn");
        System.out.println(car.CUSTOMER);

        Ferrari ferrari = new Ferrari("Roma");
        ferrari.print();
    }
}
