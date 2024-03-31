package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrooperPropertiesException;
import com.amaap.trooptraining.domain.model.Weapon;
import com.amaap.trooptraining.domain.validators.TrainingCostValidator;
import com.amaap.trooptraining.domain.validators.TrainingTimeValidator;

import java.util.Objects;

public class Trooper
{

    private final int trainingTime;
    private final int trainingCost;
    private final Weapon weapon;
    public Trooper(int TrainingTime, int TrainingCost, Weapon weapon) throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        if(TrainingCostValidator.validateCost(TrainingCost) && TrainingTimeValidator.validateTime(TrainingTime)) throw new InvalidTrooperPropertiesException("Both Training time and cost are invalid");
        if(TrainingTimeValidator.validateTime(TrainingTime)) throw new InvalidTrainingTimeException("Invalid training time check it once");
        if(TrainingCostValidator.validateCost(TrainingCost)) throw new InvalidTrainingCostException("Cost is invalid");
        this.trainingTime = TrainingTime;
        this.trainingCost = TrainingCost;
        this.weapon = weapon;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trooper trooper = (Trooper) o;
        return trainingTime == trooper.trainingTime && trainingCost == trooper.trainingCost && weapon == trooper.weapon;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(trainingTime, trainingCost, weapon);
//    }
}
