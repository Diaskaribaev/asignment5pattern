package com.company;

public class Iphone extends Smartphone {

    Iphone(Os c) {
        super(c);
    }

    @Override
    public void applyOS() {
        System.out.print("Iphone has ");
        os.applyOS();
    }
}
