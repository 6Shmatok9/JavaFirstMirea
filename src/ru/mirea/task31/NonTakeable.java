package ru.mirea.task31;

import java.util.HashMap;

public class NonTakeable extends ItemDecorator implements Item
{
    public NonTakeable(String name, HashMap<String, Integer> iactResp)
    {
        super(new Prop(name, iactResp), type.NT);
    }
}
