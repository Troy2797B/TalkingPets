package io.zipcoder.polymorphism.pets;

public class Rabbit extends Pet{

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Honk!";
    }
}
