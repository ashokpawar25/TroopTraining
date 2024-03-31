package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exception.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exception.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exception.InvalidTrooperPropertiesException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;

public class ArmyCampTest {
    @Test
    void shouldBeAbleToAddTrooperInArmyCamp() throws  InvalidTrainingCostException, InvalidTrainingTimeException, InvalidTrooperPropertiesException {
        // arrange
        ArmyCamp armyCamp = new ArmyCamp();
        Trooper trooper = new Barbarian();

        // act
        armyCamp.addTrooper(trooper);
        Queue<Trooper> troopers = armyCamp.getTrooperList();

        // assert
        Assertions.assertEquals(trooper, troopers.peek());
    }

    @Test
    void shouldBeAbleToGetCountOfArcherAndBarbarian() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        ArmyCamp armyCamp = new ArmyCamp();
        Trooper Archer1 = new Archer();
        Trooper Archer2 = new Archer();
        Trooper Barbarian1 = new Barbarian();
        Trooper Barbarian2 = new Barbarian();

        // act
        armyCamp.addTrooper(Archer1);
        armyCamp.addTrooper(Archer2);
        armyCamp.addTrooper(Barbarian1);
        armyCamp.addTrooper(Barbarian2);

        int expectedArcherCount = armyCamp.getArcherCount();
        int expectedBarbarianCount = armyCamp.getBarbarianCount();

        // assert
        Assertions.assertEquals(2, expectedArcherCount);
        Assertions.assertEquals(2, expectedBarbarianCount);

    }

}
