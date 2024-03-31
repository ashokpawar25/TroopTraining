package com.amaap.trooptraining.domain;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;

import java.util.LinkedList;
import java.util.Queue;

public class ArmyCamp
{
    private final Queue<Trooper> trainedTroopers;

    public ArmyCamp()
    {
        trainedTroopers = new LinkedList<>();
    }
    public Queue<Trooper> getTrooperList()
    {
        return trainedTroopers;
    }

    public void addTrooper(Trooper trooper)
    {
        trainedTroopers.add(trooper);
    }

    public int getArcherCount()
    {
        int ArcherCount = 0;
        for(Trooper trooper:trainedTroopers)
        {
            if(trooper instanceof Archer)
            {
                ArcherCount++;
            }
        }
        return ArcherCount;
    }


    public int getBarbarianCount()
    {
        int BarbarianCount = 0;
        for(Trooper trooper:trainedTroopers)
        {
            if(trooper instanceof Barbarian)
            {
                BarbarianCount++;
            }
        }
        return BarbarianCount;
    }
}
