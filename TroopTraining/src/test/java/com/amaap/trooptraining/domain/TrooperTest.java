package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exception.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exception.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exception.InvalidTrooperPropertiesException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;
import com.amaap.trooptraining.domain.model.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TrooperTest {

    @Test
    void shouldBeAbleToGetTrainingTimeForTrooper() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        Trooper trooper = new Barbarian();
        int expectedTrainingTime = 3;

        // act
        int actualTrainingTime = trooper.getTrainingTime();

        // assert
        assertEquals(expectedTrainingTime, actualTrainingTime);
    }

    @Test
    void shouldBeAbleToThrowExceptionWhenInvalidTrainingTime() {
        // arrange
        int trainingTime = 4;
        int trainingCost = 10;
        Weapon weapon = Weapon.Sword;

        // act & assert
        assertThrows(InvalidTrainingTimeException.class, () -> new Trooper(trainingTime, trainingCost, weapon));
    }

    @Test
    void shouldBeAbleToGetTrainingCostForTrooper() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        Trooper trooper = new Archer();
        int expectedTrainingCost = 20;

        // act
        int actualTrainingCost = trooper.getTrainingCost();

        // assert
        assertEquals(expectedTrainingCost, actualTrainingCost);
    }


    @Test
    void shouldBeAbleToThrowExceptionWhenInvalidTrainingCost() {
        // arrange
        int trainingTime = 3;
        int trainingCost = 0;
        Weapon weapon = Weapon.BowAndArrow;

        // act & assert
        assertThrows(InvalidTrainingCostException.class, () -> new Trooper(trainingTime, trainingCost, weapon));
    }

    @Test
    void shouldBeAbleToThrowExceptionWhenInvalidTrainingCostAndInvalidTrainingTime() {
        // arrange
        int trainingTime = 7;
        int trainingCost = 0;
        Weapon weapon = Weapon.BowAndArrow;

        // act & assert
        assertThrows(InvalidTrooperPropertiesException.class, () -> new Trooper(trainingTime, trainingCost, weapon));

    }

    @Test
    void shouldBeAbleToValidateEqualObjects() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        Trooper trooper1 = new Trooper(3,10,Weapon.Sword);
        Trooper trooper2 = new Trooper(3,10,Weapon.Sword);

        // assert
        assertEquals(trooper1,trooper2);
    }

    @Test
    void shouldAbleToValidateNotEqualObjects() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        Trooper trooper1 = new Trooper(3,10,Weapon.Sword);
//        Trooper trooper2 = new Trooper(6,20,Weapon.BowAndArrow);

        // assert
        assertNotEquals(trooper1,null);

    }
}
