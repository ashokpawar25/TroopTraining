package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrooperPropertiesException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArmyCampTest {
    @Test
    void shouldAbleToAddTrooperInArmyCamp() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrainingTimeException, InvalidTrooperPropertiesException {
        //Arrange
        ArmyCamp armyCamp = new ArmyCamp();
        Trooper trooper = new Barbarian();

        //Act
        armyCamp.addTrooper(trooper);
        List<Trooper> troopers = armyCamp.getTrooperList();

        //Assert
        Assertions.assertEquals(trooper, troopers.get(0));
    }

    @Test
    void shouldAbleToGetCountOfArcherAndBarbarian() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        //Arrange
        ArmyCamp armyCamp = new ArmyCamp();
        Trooper Archer1 = new Archer();
        Trooper Archer2 = new Archer();
        Trooper Barbarian1 = new Barbarian();
        Trooper Barbarian2 = new Barbarian();

        //Act
        armyCamp.addTrooper(Archer1);
        armyCamp.addTrooper(Archer2);
        armyCamp.addTrooper(Barbarian1);
        armyCamp.addTrooper(Barbarian2);

        int expectedArcherCount = armyCamp.getArcherCount();
        int expectedBarbarianCount = armyCamp.getBarbarianCount();

        //Assert
        Assertions.assertEquals(2, expectedArcherCount);
        Assertions.assertEquals(2, expectedBarbarianCount);

    }

}
