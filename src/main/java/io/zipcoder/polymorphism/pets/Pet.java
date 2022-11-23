package io.zipcoder.polymorphism.pets;

public abstract class Pet {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Pet(String name){
        this.name = name;
    }

    public abstract String speak();
}
