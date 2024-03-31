package com.amaap.trooptraining.domain.service;

import com.amaap.trooptraining.domain.ArmyCamp;
import com.amaap.trooptraining.domain.Barrack;
import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exceptions.*;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainTrooperTest {

    @Test
    void shouldBeAbleToTrainArcherAndAddToArmyCamp() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException, InvalidTrooperQueueException, BarrackOverFlowException, InterruptedException {
        // arrange
        Trooper trooper = new Archer();
        Barrack barrack = new Barrack(10);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);
        Queue<Trooper> trooperQueue = new LinkedList<>();
        trooperQueue.add(trooper);

        // act
        barrack.addTrooper(trooperQueue);
        boolean isTrained = trainTrooper.trainTroopers();
        int trainedArcherCount = armyCamp.getArcherCount();

        // assert
        assertTrue(isTrained);
        assertEquals(trooperQueue.size(), trainedArcherCount);

    }

    @Test
    void shouldBeAbleToTrainBarbarianAndAddToArmyCamp() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException, InvalidTrooperQueueException, BarrackOverFlowException, InterruptedException {
        // arrange
        Trooper trooper = new Barbarian();
        Barrack barrack = new Barrack(10);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);
        Queue<Trooper> trooperQueue = new LinkedList<>();
        trooperQueue.add(trooper);

        // act
        barrack.addTrooper(trooperQueue);
        boolean isTrained = trainTrooper.trainTroopers();
        int trainedBarbarianCount = armyCamp.getBarbarianCount();

        // assert
        assertTrue(isTrained);
        assertEquals(trooperQueue.size(), trainedBarbarianCount);
    }

    @Test
    void shouldBeAbleToTrainMultipleTroopers() throws InvalidTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException, InterruptedException, InvalidTrooperPropertiesException, InvalidTrooperQueueException {
        //Arrange
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Barbarian();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Barbarian();
        Queue<Trooper> troopersQueue = new LinkedList<>();
        List<Trooper> troopersList = List.of(trooper1, trooper2, trooper3, trooper4);
        troopersQueue.addAll(troopersList);


        //Act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(troopersQueue);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);
        boolean isTrained = trainTrooper.trainTroopers();

        //Assert
        assertTrue(isTrained);
    }

    @Test
    void shouldAbleToSendTrooperInTheArmyCampOnceTrainingCompleted() throws InvalidTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException, InterruptedException, InvalidTrooperPropertiesException, InvalidTrooperQueueException {
        //Arrange
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Barbarian();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Barbarian();
        Queue<Trooper> troopersQueue = new LinkedList<>();
        List<Trooper> troopersList = List.of(trooper1, trooper2, trooper3, trooper4);
        troopersQueue.addAll(troopersList);

        //Act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(troopersQueue);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);
        trainTrooper.trainTroopers();

        Queue<Trooper> trainedTroopers = armyCamp.getTrooperList();

        //Assert
        assertEquals(4, trainedTroopers.size());
    }

    @Test
    void shouldAbleToGetCountOfArcherAndBarbarianWhoCompletedTrainingAndPresentInArmyCamp() throws InterruptedException, BarrackOverFlowException, InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException, InvalidTrooperQueueException {
        //Arrange
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Barbarian();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Barbarian();
        Queue<Trooper> troopersQueue = new LinkedList<>();
        List<Trooper> troopersList = List.of(trooper1, trooper2, trooper3, trooper4);
        troopersQueue.addAll(troopersList);
        ArmyCamp armyCamp = new ArmyCamp();
        Barrack barrack = new Barrack(10);
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);

        //Act
        barrack.addTrooper(troopersQueue);
        trainTrooper.trainTroopers();

        int archerCount = armyCamp.getArcherCount();
        int barbarianCount = armyCamp.getBarbarianCount();

        //Assert
        assertEquals(2, archerCount);
        assertEquals(2, barbarianCount);
    }
}
