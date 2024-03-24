package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import com.amaap.trooptraining.domain.model.Weapon;
import com.amaap.trooptraining.domain.validators.TrainingCostValidator;
import com.amaap.trooptraining.domain.validators.TrainingTimeValidator;

import java.util.Objects;

public class Trooper
{

    private final int trainingTime;
    private final int trainingCost;
    private final Weapon weapon;
    public Trooper(int time, int cost, Weapon weapon) throws InvalideTrainingTimeException, InvalidTrainingCostException {
        if(!TrainingTimeValidator.validateTime(time)) throw new InvalideTrainingTimeException("Invalide training time check it once");
        if(!TrainingCostValidator.validateCost(cost)) throw new InvalidTrainingCostException("Cost is invalide");
        this.trainingTime = time;
        this.trainingCost = cost;
        this.weapon = weapon;
    }


    public int getTrainingTime() {
        return trainingTime;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

    public Weapon getWeapon() {
        return weapon;
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
