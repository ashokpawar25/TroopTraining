package com.amaap.trooptraining.domain.model;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exception.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exception.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exception.InvalidTrooperPropertiesException;

public class Barbarian extends Trooper
{
    public Barbarian() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        super(3,10, Weapon.Sword);
    }
}
