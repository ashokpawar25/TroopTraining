package com.amaap.trooptraining.domain.service;

import com.amaap.trooptraining.domain.Trooper;

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
}
