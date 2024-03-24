package com.amaap.trooptraining.domain;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;

import java.util.ArrayList;
import java.util.List;

public class ArmyCamp
{
    private List<Trooper> trainedTroopers;

    public ArmyCamp()
    {
        trainedTroopers = new ArrayList<>();
    }
    public List<Trooper> getTrooperList()
    {
        return trainedTroopers;
    }

    public boolean addTrooper(Trooper trooper)
    {
        trainedTroopers.add(trooper);
        return true;
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
