package com.bridgelbz;

public class Main {
    public static void main(String[]args){
        BirdSanctuary sanctuary = new BirdSanctuary();

        Parrot parrot = new Parrot();
        Duck duck = new Duck();
        Penguine penguin = new Penguine();

        sanctuary.add(parrot);
        sanctuary.add(duck);
        sanctuary.add(penguin);

        sanctuary.printBirds();
    }

}
