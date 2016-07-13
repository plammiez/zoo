package com.waraporn.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Waraporn on 7/13/2016.
 */
public class Staff {

    List<Animal> animals = new ArrayList<>();

    public void addAnimal(int id, String name, String type, int age){
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

    }
}
