package com.waraporn.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Waraporn on 7/13/2016.
 */
public class Staff {

    List<Animal> animals = new ArrayList<>();

    public void addAnimal(int id, String name, String type) {
        //add new animal information.
        animals.add(new Animal(id, name, type));
    }

    public void deleteAnimal(int id) {
        //select animal that has this id and delete it.
        animals.remove(id);
    }

    public List<Animal> listAnimalAll() {
        //list all animal in zoo.
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).toString());
        }
        System.out.println("------------------------------------");
        return animals;
    }

    public void feedingFood(List<Animal> animal){

        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getType() == "Herbivores") {
                Herbivores h = new Herbivores();
                h.feedingHerb(animal.get(i).getName());
            } else if (animal.get(i).getType() == "Omnivores") {
                Omnivores o = new Omnivores();
                o.feedingHerb(animal.get(i).getName());
                o.feedingMeat(animal.get(i).getName());
            } else if (animal.get(i).getType() == "Carnivores") {
                Carnivores c = new Carnivores();
                c.feedingMeat(animal.get(i).getName());
            }
        }

    }

    public static void main(String[] args) {

        Staff a = new Staff();
        a.addAnimal(1, "Fish", "Carnivores");
        a.addAnimal(2, "Bird", "Omnivores");
        a.addAnimal(3, "Turtle", "Herbivores");
        a.addAnimal(4, "Cow", "Herbivores");
        a.addAnimal(5, "Rabbit", "Herbivores");

        a.listAnimalAll();

        Animal animal1 = new Animal(6, "Buffalo", "Herbivores");
        Animal animal2 = new Animal(7, "Tiger", "Carnivores");
        Animal animal3 = new Animal(8, "Bear", "Omnivores");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        a.feedingFood(animals);

        a.deleteAnimal(2);

        a.listAnimalAll();
    }


}
