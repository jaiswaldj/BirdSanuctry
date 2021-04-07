package com.bridgelbz;


import java.util.ArrayList;
import java.util.List;

public class BirdSanctuary {
    private List<Bird> birdList = new ArrayList<>();

    public   void add (Bird bird) {
        birdList.add(bird);
    }


    public void printBirds() {
        for (Bird bird: birdList){
            bird.fly();

        }
    }



}


