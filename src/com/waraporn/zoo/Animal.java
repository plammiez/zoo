package com.waraporn.zoo;

/**
 * Created by Waraporn on 7/12/2016.
 */
public class Animal {

    private  int id;
    private String name;
    private String type;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void addAnimal(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    protected void deleteAnimal(int id){
        //check id and del
    }

    public String listAnimal(){
        //list of animal all in zoo
        return "";
    }
}
