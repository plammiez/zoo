package com.waraporn.zoo;

/**
 * Created by Waraporn on 7/13/2016.
 */
public class Omnivores extends Animal implements HerbFood,MeatFood{

    public Omnivores() {

    }

    public void feedingHerb(String name) {
        //feeding herb for animals.
        System.out.println("***************************");
        System.out.println("feeding 'HERB' for " + name);
    }

    @Override
    public void feedingMeat(String name) {
        //feeding meat for animals.
        System.out.println("feeding 'MEAT' for " + name);
        System.out.println("***************************");
    }
}
