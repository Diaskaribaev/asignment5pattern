package com.company;

public class CatAdapter extends Cat  implements Animal
{
    Cat cat;
    public CatAdapter(Cat cat)
    {

        this.cat = cat;
    }

    @Override
    public void fly() {
        cat.run();
    }
}
