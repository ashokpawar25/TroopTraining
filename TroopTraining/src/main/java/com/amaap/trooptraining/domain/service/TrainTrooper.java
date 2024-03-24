package com.amaap.trooptraining.domain.service;
import java.util.List;
import com.amaap.trooptraining.domain.Barrack;
import com.amaap.trooptraining.domain.Trooper;

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
        List<Trooper> allTroopers = barrack.getTrooperList();
        for(Trooper trooper:allTroopers)
        {
            Thread.sleep(trooper.getTrainingTime()*1000);
            System.out.println("Trained");
            armyCamp.addTrooper(trooper);
        }
        return  true;
    }
}
