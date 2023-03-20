package main;

import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "bibi";
        cat.age = 5;
        cat.color = "white";
        Dog dog = new Dog();
        dog.name = "dudu";
        dog.age = 6;
        dog.color = "brown";
        System.out.println("Name: "+cat.name+"\n"+"Age: "+cat.age+"\n"+"Color: "+cat.color);
        System.out.println("---------------");
        System.out.println("Name: "+dog.name+"\n"+"Age: "+dog.age+"\n"+"Color: "+dog.color);

    }
}