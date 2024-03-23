package com.amaap.trooptraining.domain;

import java.util.Objects;

public class Trooper
{

    int trainingTime;
    int trainingCost;
    Weapon weapon;
    public Trooper(int time, int cost, Weapon weapon)
    {
        this.trainingTime = time;
        this.trainingCost = cost;
        this.weapon = weapon;
    }

    public static Trooper Create(int time, int cost, Weapon weapon)
    {
        return new Trooper(time,cost,weapon);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trooper trooper = (Trooper) o;
        return trainingTime == trooper.trainingTime && trainingCost == trooper.trainingCost && weapon == trooper.weapon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingTime, trainingCost, weapon);
    }
}
