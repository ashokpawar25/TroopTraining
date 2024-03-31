package com.amaap.trooptraining.domain.model;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrooperPropertiesException;

public class Archer extends Trooper
{
    public Archer() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        super(6,20,Weapon.BowAndArrow);
    }
}
