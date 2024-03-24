package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrooperTest {
    @Test
    void shouldAbleToCreateTrooper() throws InvalideTrainingTimeException, InvalidTrainingCostException {
        //Arrange
        Trooper expectedTrooper = new Trooper(3, 10, Weapon.Sword);

        //Act
        Trooper actualTrooper = Trooper.Create(3, 10, Weapon.Sword);

        //Assert
        Assertions.assertEquals(expectedTrooper, actualTrooper);
    }

    @Test
    void shouldThrownExceptionWhenInvalidTrainingTime() throws InvalideTrainingTimeException {
        //Arrange
        int trainingTime = 4;
        int trainingCost = 10;
        Weapon weapon = Weapon.Sword;

        //Assert
        Assertions.assertThrows(InvalideTrainingTimeException.class, () -> Trooper.Create(trainingTime, trainingCost, weapon));
    }

    @Test
    void shouldThrowExceptionWhenInvalidCost() {
        //Arrange
        int trainingTime = 3;
        int trainingCost = 0;
        Weapon weapon = Weapon.BowAndArrow;

        Assertions.assertThrows(InvalidTrainingCostException.class, () -> Trooper.Create(trainingTime, trainingCost, weapon));
    }

}
