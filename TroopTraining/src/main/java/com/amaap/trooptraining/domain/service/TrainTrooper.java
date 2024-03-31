package com.amaap.trooptraining.domain.service;
import java.util.List;
import java.util.Queue;

import com.amaap.trooptraining.domain.ArmyCamp;
import com.amaap.trooptraining.domain.Barrack;
import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;

public class TrainTrooper
{
    Barrack barrack;
    ArmyCamp armyCamp;
    public TrainTrooper(Barrack barrack, ArmyCamp armyCamp)
    {
        this.barrack = barrack;
        this.armyCamp = armyCamp;
    }

    public boolean trainTroopers() throws InterruptedException {
        Queue<Trooper> allTroopers = barrack.getTrooperList();
        for(Trooper trooper:allTroopers)
        {
            Thread.sleep(trooper.getTrainingTime()* 1000L);
            if(trooper instanceof Archer) System.out.println("Archer Trained");
            if(trooper instanceof Barbarian)  System.out.println("Barbarian Trained");
            armyCamp.addTrooper(trooper);
            allTroopers.remove();
        }
        return allTroopers.isEmpty();
    }
}
