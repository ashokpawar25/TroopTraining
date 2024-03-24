package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exceptions.BarrackOverFlowException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Weapon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BarrackTest {
    @Test
    void shouldAbleToAddTrooperInBarrack() throws InvalideTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException {
        //Arrange
        Trooper trooper = new Archer();
        List<Trooper> troopers = List.of(trooper);
        //Act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(troopers);
        List<Trooper> actualTrooperList = barrack.getTrooperList();

        //Assert
        Assertions.assertEquals(1, actualTrooperList.size());
    }

    @Test
    void shouldThrowExceptionWhenBarrackSizeFull() throws InvalideTrainingTimeException, InvalidTrainingCostException {
        //Arrange
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Archer();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Archer();
        Trooper trooper5 = new Archer();
        Trooper trooper6 = new Archer();
        Trooper trooper7 = new Archer();
        Trooper trooper8 = new Archer();
        Trooper trooper9 = new Archer();
        Trooper trooper10 = new Archer();
        Trooper trooper11 = new Archer();

        List<Trooper> troopers = List.of(trooper1, trooper2, trooper3, trooper4, trooper5, trooper6, trooper7, trooper8, trooper9, trooper10, trooper11);

        Barrack barrack = new Barrack(10);

        //Assert
        Assertions.assertThrows(BarrackOverFlowException.class, () -> barrack.addTrooper(troopers));

    }
}
