package app;

import def.*;

import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Bob");
        Gato cat = new Gato("Mickey");

        System.out.println(dog.caminha());

        System.out.println(dog.late());
        System.out.println(cat.mia());

        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(dog);
        animalList.add(cat);
    }
}
