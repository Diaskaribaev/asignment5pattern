package com.company;

public class SharkAdapter extends Shark  implements Animal
{
    Shark shark;
    public SharkAdapter(Shark shark)
    {

        this.shark = shark;
    }

    @Override
    public void fly() {
        shark.swim();
    }
}
