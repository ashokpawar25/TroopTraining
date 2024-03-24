package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import com.amaap.trooptraining.domain.model.Weapon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrooperTest {

    @Test
    void shouldThrowExceptionWhenInvalidTrainingTime() throws InvalideTrainingTimeException {
        //Arrange
        int trainingTime = 4;
        int trainingCost = 10;
        Weapon weapon = Weapon.Sword;

        //Assert
        Assertions.assertThrows(InvalideTrainingTimeException.class, () -> new Trooper(trainingTime, trainingCost, weapon));
    }

    @Test
    void shouldThrowExceptionWhenInvalidCost() {
        //Arrange
        int trainingTime = 3;
        int trainingCost = 0;
        Weapon weapon = Weapon.BowAndArrow;

        Assertions.assertThrows(InvalidTrainingCostException.class, () -> new Trooper(trainingTime, trainingCost, weapon));
    }

}
