package com.amaap.trooptraining.domain.model;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.Weapon;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;

public class Archer extends Trooper
{
    public Archer() throws InvalideTrainingTimeException, InvalidTrainingCostException {
        super(6,20,Weapon.BowAndArrow);
        Create(6,20,Weapon.BowAndArrow);
    }
}
