package com.amaap.trooptraining.domain;

import java.util.ArrayList;
import java.util.List;

public class Barrack
{
    private List<Trooper> trooperList ;
    private final int maxCapacity;
    public Barrack(int maxCapacity)
    {
        this.trooperList = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void addTrooper(Trooper trooper)
    {
        trooperList.add(trooper);
    }

    public List<Trooper> getTrooperList()
    {
        return trooperList;
    }
}
