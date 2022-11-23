package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {
    //Create a program that asks the user how many pets they have.
    // Once you know how many pets they have, ask them what kind of
    // pet each one is, along with each pet's name.
    // For now your program should just hold onto the user input
    // and print out the list at the end; we'll modify this in part 3.

    public int howManyPets(){
        Scanner objScan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = objScan.nextInt();
        return numOfPets;
    }
    public  String whatKindOfPets(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of pet is this one? Cat, dog, or rabbit?");
        String typeOfPets = scan.nextLine();
        return typeOfPets;
    }
    public String whatIsTheNameOfEachPet(){
        Scanner obj = new Scanner(System.in);
        System.out.println("What is the name of your pet?");
        String nameOfPets = obj.nextLine();
        return nameOfPets;
    }
    public String anymorePets(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Do you have anymore?");
        String answer = obj.nextLine();
        return answer;
    }
}
