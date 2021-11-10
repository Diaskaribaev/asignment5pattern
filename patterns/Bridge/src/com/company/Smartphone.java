package com.company;

public abstract class Smartphone {

    //Composition - implementor
    protected Os os;

    //constructor with implementor as input argument
    public Smartphone( Os c) {
        this.os = c;
    }

    abstract public void applyOS();
}
