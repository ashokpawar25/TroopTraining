package com.amaap.trooptraining.domain.model;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exception.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exception.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exception.InvalidTrooperPropertiesException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArcherTest
{
    @Test
    void shouldBeAbleToCreateInstanceOfArcher() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange & act
        Trooper trooper = new Archer();

        // assert
        assertNotNull(trooper);
    }

    @Test
    void shouldBeAbleToGetPropertiesOfArchers() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        int expectedTrainingTime = 6;
        int expectedTrainingCost = 20;
        Weapon expectedWeapon = Weapon.BowAndArrow;

        // act
        Trooper trooper = new Archer();

        // assert
        assertEquals(expectedTrainingTime,trooper.getTrainingTime());
        assertEquals(expectedTrainingCost,trooper.getTrainingCost());
        assertEquals(expectedWeapon,trooper.getWeapon());
    }

}
