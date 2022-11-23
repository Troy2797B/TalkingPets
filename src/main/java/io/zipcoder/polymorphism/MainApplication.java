package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Cat;
import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Pet;
import io.zipcoder.polymorphism.pets.Rabbit;

import javax.swing.*;
import java.sql.SQLOutput;

public class MainApplication {

    public static void main(String[] args) {

        Console console = new Console();
        int numOfPets = console.howManyPets();
        int count = 0;
        do{
        if (numOfPets > 0) {
            String typeOfPets = console.whatKindOfPets();
            typeOfPets.toLowerCase();
            if (typeOfPets.equals("dog")) {
                String nameOfPets = console.whatIsTheNameOfEachPet();
                Dog dog = new Dog(nameOfPets);
                System.out.println(dog.getName() + ": " + dog.speak());
                count++;
            } else if (typeOfPets.equals("cat")) {
                String nameOfPets = console.whatIsTheNameOfEachPet();
                Cat cat = new Cat(nameOfPets);
                System.out.println(cat.getName() + ": " + cat.speak());
                count++;
            } else if (typeOfPets.equals("rabbit")) {
                String nameOfPets = console.whatIsTheNameOfEachPet();
                Rabbit rabbit = new Rabbit(nameOfPets);
                System.out.println(rabbit.getName() + ": " + rabbit.speak());
                count++;
            }
        }} while(count < numOfPets);

    }
}
