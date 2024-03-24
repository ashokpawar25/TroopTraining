package com.amaap.trooptraining.domain.service;

import com.amaap.trooptraining.domain.Barrack;
import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exceptions.BarrackOverFlowException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalideTrainingTimeException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TrainTrooperTest {
    @Test
    void shouldAbleToTrainTroopersFromTheBarrack() throws InvalideTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException, InterruptedException {
        //Arrange
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Barbarian();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Barbarian();
        List<Trooper> troopers = List.of(trooper1, trooper2, trooper3, trooper4);

        //Act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(troopers);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);
        boolean isTrained = trainTrooper.trainTroopers();

        //Assert
        Assertions.assertTrue(isTrained);
    }

    @Test
    void shouldAbleToSendTrooperInTheArmyCampOnceTrainingCompleted() throws InvalideTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException, InterruptedException {
        //Arrange
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Barbarian();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Barbarian();
        List<Trooper> troopers = List.of(trooper1, trooper2, trooper3, trooper4);

        //Act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(troopers);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);
        trainTrooper.trainTroopers();

        List<Trooper> trainedTroopers = armyCamp.getTrooperList();

        //Assert
        Assertions.assertEquals(4, trainedTroopers.size());
    }
}
