package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Weapon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BarrackTest {
    @Test
    void shouldAbleToAddTrooperInBarrack() throws InvalideTrainingTimeException, InvalidTrainingCostException {
        //Arrange
        Trooper trooper = new Archer();

        //Act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(trooper);
        List<Trooper> actualTrooperList = barrack.getTrooperList();

        //Assert
        Assertions.assertEquals(1, actualTrooperList.size());
    }
}
