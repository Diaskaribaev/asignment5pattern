package com.company;

public class Main {

    public static void main(String[] args) {
//        Shape tri = new Triangle(new RedColor());
//        Shape pent = new Pentagon(new GreenColor());
//
//        tri.applyColor();
//        pent.applyColor();

        Smartphone samsung = new Samsung(new Android());

        Smartphone Iphone= new Iphone(new Ios());

        samsung.applyOS();
        Iphone.applyOS();



    }
}
