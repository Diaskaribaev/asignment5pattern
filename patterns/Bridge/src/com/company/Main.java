package com.company;

public class Main {

    public static void main(String[] args) {

        Smartphone samsung = new Samsung(new Android());

        Smartphone Iphone= new Iphone(new Ios());

        samsung.applyOS();
        Iphone.applyOS();



    }
}
