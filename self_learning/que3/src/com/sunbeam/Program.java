package com.sunbeam;

import java.util.ArrayList;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}


class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    public void roar() {
        System.out.println("Lion is roaring.");
    }
}

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    public void trumpet() {
        System.out.println("Elephant is trumpeting.");
    }
}


class Zoo {
    private String zooName;
    private ArrayList<Animal> animals;

    public Zoo(String zooName) {
        this.zooName = zooName;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        System.out.println("Zoo Name: " + zooName);

        for (Animal animal : animals) {
            animal.display();
            animal.eat();
        }
    }
}

public class Program {
    public static void main(String[] args) {

        Lion lion = new Lion("Sheru");
        Elephant elephant = new Elephant("Raju");

        Zoo zoo = new Zoo("City Zoo");

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.displayAnimals();

        lion.roar();
        elephant.trumpet();
    }
}