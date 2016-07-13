package com.waraporn.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Waraporn on 7/13/2016.
 */
public class Staff {

    List<Animal> animals = new ArrayList<>();

    public void addAnimal(int id, String name, String type){
        //add new animal information.
    }

    public void deleteAnimal(int id){
        //select animal that has this id and delete it.
    }

    public List<Animal> listAnimalAll(){
        //list all animal in zoo.

        return animals;
    }

    public static void main(String [] args){

        Staff a = new Staff();
        a.addAnimal(1, "Fish", "Carnivores");
        a.addAnimal(2, "Bird", "Omnivores");
        a.addAnimal(3, "Turtle", "Herbivores");
        a.addAnimal(4, "Cow", "Herbivores");
        a.addAnimal(5, "Rabbit", "Herbivores");

        a.deleteAnimal(2);

        a.listAnimalAll();
    }
}
