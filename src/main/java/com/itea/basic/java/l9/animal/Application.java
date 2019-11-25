package com.itea.basic.java.l9.animal;

public class Application {

    public static void main(String[] args) {

        Animal[] animals = new Animal[10];

        animals[0] = new Dog();
        animals[0] = new Cat();

        Swimmable[] swimmables = new Swimmable[10];
        swimmables[0] = new Dog();
        swimmables[1] = new Fish();
    }


}
