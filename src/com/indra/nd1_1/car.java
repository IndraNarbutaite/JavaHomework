package com.indra.nd1_1;

class Vehicle {

    String brand;
    String color;
    double weight;
    double speed;

    void move() {
        System.out.println("The vehicle is moving");
    }

}

class Car extends Vehicle {

    String licensePlateNumber;
    String owner;
    String bodyStyle;

    public static void main(String... inheritanceExample) {
        System.out.println(new Vehicle().brand);
        System.out.println(new Car().brand);
        new Car().move();
    }

}