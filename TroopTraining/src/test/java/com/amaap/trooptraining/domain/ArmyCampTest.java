package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import com.amaap.trooptraining.domain.model.Barbarian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArmyCampTest {
    @Test
    void shouldAbleToAddTrooperInArmyCamp() throws InvalideTrainingTimeException, InvalidTrainingCostException {
        //Arrange
        ArmyCamp armyCamp = new ArmyCamp();
        Trooper trooper = new Barbarian();

        //Act
        armyCamp.addTrooper(trooper);
        List<Trooper> troopers = armyCamp.getTrooperList();

        //Assert
        Assertions.assertEquals(trooper, troopers.get(0));
    }

    

}
