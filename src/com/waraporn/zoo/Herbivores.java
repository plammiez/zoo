package com.waraporn.zoo;

/**
 * Created by Waraporn on 7/13/2016.
 */
public class Herbivores extends Animal implements HerbFood{

    private static final String HERBIVORES = "herbivores";

    public Herbivores() {

    }

    public void feedingHerb(String name) {
        //feeding herb for animals.
        System.out.println("***************************");
        System.out.println("feeding 'HERB' for " + name);
        System.out.println("***************************");
    }

}
