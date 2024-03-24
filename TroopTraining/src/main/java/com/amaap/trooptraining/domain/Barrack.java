package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.BarrackOverFlowException;

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

    public void addTrooper(List<Trooper> troopers) throws BarrackOverFlowException {
        for (Trooper trooper:troopers)
        {
            if(trooperList.size() == maxCapacity) throw new BarrackOverFlowException("You can't add troopers more than barrack size");
            trooperList.add(trooper);
        }
    }

    public List<Trooper> getTrooperList()
    {
        return trooperList;
    }
}
