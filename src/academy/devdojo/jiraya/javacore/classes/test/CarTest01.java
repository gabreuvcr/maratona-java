package academy.devdojo.jiraya.javacore.classes.test;

import academy.devdojo.jiraya.javacore.classes.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car carA = new Car();
        Car carB = new Car();
        
        carA.name = "Fusca";
        carA.model = "Sport";
        carA.age = 1969;

        carB.name = "Mustang";
        carB.model = "GT 500";
        carB.age = 1968;

        System.out.println("Carro A:");
        System.out.println(carA.name + " " + carA.model + " " + carA.age);
        System.out.println("\nCarro B:");
        System.out.println(carB.name + " " + carB.model + " " + carB.age);
    }
}
