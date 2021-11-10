package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Shark shark = new Shark();
        Shark shark1= new SharkAdapter(shark);
        Eagle eagle = new Eagle();
        Cat cat1 = new CatAdapter(cat);


        cat.run();
        eagle.fly();
       shark.swim();
    }
}
