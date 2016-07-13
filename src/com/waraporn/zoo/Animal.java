package com.waraporn.zoo;

/**
 * Created by Waraporn on 7/12/2016.
 */
public class Animal {

    private  int id;
    private String name;
    private String type;

    public Animal() {

    }

    @Override
    public String toString() {
        //return super.toString();
        return "Animal-ID: "+ id + " Name: "+ name + " Type: " + type;
    }

    public Animal(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
