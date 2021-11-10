package com.company;

public abstract class Smartphone {

    
    protected Os os;

    
    public Smartphone( Os c) {
        this.os = c;
    }

    abstract public void applyOS();
}
