package io.zipcoder.polymorphism.pets;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Woof!";
    }
}
