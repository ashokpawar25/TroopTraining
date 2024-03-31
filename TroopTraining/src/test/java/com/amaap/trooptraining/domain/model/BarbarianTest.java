package com.amaap.trooptraining.domain.model;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrooperPropertiesException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BarbarianTest {
    @Test
    void shouldBeAbleToCreateInstanceOfBarbarian() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange & act
        Trooper trooper = new Barbarian();

        // assert
        assertNotNull(trooper);
    }

    @Test
    void shouldBeAbleToGetPropertiesOfArchers() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        int expectedTrainingTime = 3;
        int expectedTrainingCost = 10;
        Weapon expectedWeapon = Weapon.Sword;

        // act
        Trooper trooper = new Barbarian();

        // assert
        assertEquals(expectedTrainingTime, trooper.getTrainingTime());
        assertEquals(expectedTrainingCost, trooper.getTrainingCost());
        assertEquals(expectedWeapon, trooper.getWeapon());
    }
}
