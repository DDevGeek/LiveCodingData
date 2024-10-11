package Farming;

import Interfaces.AnimalInteraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class SimpleAnimal implements AnimalInteraction {
    List<String> animalInteractionsHistory;
    Map<String, List<String>> animals;

    String name;
    String sound;

    public SimpleAnimal(String name, String sound) {
        animals = new HashMap<>();
        animalInteractionsHistory = new ArrayList<>();
        this.name = name;
        this.sound = sound;
    }

    public void action() {
        System.out.println("Animal behaviour");
    }

    @Override
    public void feed(String food) {
        animalInteractionsHistory.add(name + " is eating " + food);
        animals.put(name, animalInteractionsHistory);
//        System.out.println(name + " is eating " + food);
    }

    @Override
    public void play() {
//        System.out.println(name + " is playing");
        animals.put(name, animalInteractionsHistory);
        animalInteractionsHistory.add(name + " is playing");
    }

    @Override
    public void showInteractionHistory() {
        for (Map.Entry<String, List<String>> animal : animals.entrySet()) {
            System.out.println("=== " + animal.getKey() + " ===");
            for (String interaction : animal.getValue()) {
                System.out.println("    " + interaction);
            }
            System.out.println();
        }
    }
}


class Dog extends SimpleAnimal {

    public Dog (String name, String sound) {
        super(name, sound);
    }

    @Override
    public void action() {
        System.out.println(name + " " + "sound " + this.sound);
    }
}

class Cat extends SimpleAnimal {
    public Cat (String name, String sound) {
        super(name, sound);
    }

    @Override
    public void action() {
        System.out.println(name + " " + "sound " + this.sound);
    }
}

class Lion extends SimpleAnimal {
    public Lion (String name, String sound) {
        super(name, sound);
    }

    @Override
    public void action() {
        System.out.println(name + " " + "sound " + this.sound);
    }
}

public class AnimalInteractionSystem {
    public static void main(String[] args) {
        Dog dog = new Dog("Idefix", "Bark");
        Cat cat = new Cat("Raven", "meow");
        Lion lion = new Lion("Simba", "roar");

        dog.play();
        dog.feed("meat");
        dog.showInteractionHistory();

        cat.play();
        cat.feed("meat");
        cat.showInteractionHistory();

        lion.play();
        lion.feed("meat");
        lion.showInteractionHistory();
    }
}
