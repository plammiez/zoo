package com.waraporn.zoo;

/**
 * Created by Waraporn on 7/13/2016.
 */
public class Carnivores extends Animal implements MeatFood{

    private static final String CARNIVORES = "carnivores";

    public Carnivores() {

    }

    @Override
    public void feedingMeat(String name) {
        //feeding meat for animals.
        System.out.println("***************************");
        System.out.println("feeding 'MEAT' for " + name);
        System.out.println("***************************");
    }
}
