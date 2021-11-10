package com.company;

public class Samsung extends Smartphone {

    Samsung(Os c) {
        super(c);
    }


    @Override
    public void applyOS() {
        System.out.print("Samsung has ");
        os.applyOS();
    }
}
