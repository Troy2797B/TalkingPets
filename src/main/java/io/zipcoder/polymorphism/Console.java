package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {
    //Create a program that asks the user how many pets they have.
    // Once you know how many pets they have, ask them what kind of
    // pet each one is, along with each pet's name.
    // For now your program should just hold onto the user input
    // and print out the list at the end; we'll modify this in part 3.
    Scanner objScan = new Scanner(System.in);
    public void howManyPets(){
        System.out.println("How many pets do you have?");
        int numOfPets = objScan.nextInt();
        System.out.println(numOfPets);
    }
    public void whatKindOfPets(){
        System.out.println("What kind of pets do you have?");
        String typeOfPets = objScan.nextLine();
    }
    public void whatIsTheNameOfEachPet(){
        System.out.println("What is the name of your pets?");
        String nameOfPets = objScan.nextLine();
    }
}
