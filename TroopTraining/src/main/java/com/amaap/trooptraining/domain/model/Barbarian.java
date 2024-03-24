package com.amaap.trooptraining.domain.model;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;

public class Barbarian extends Trooper
{
    public Barbarian() throws InvalideTrainingTimeException, InvalidTrainingCostException {
        super(3,10, Weapon.Sword);
    }
}
