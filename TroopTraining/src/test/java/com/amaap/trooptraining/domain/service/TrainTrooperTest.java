package com.amaap.trooptraining.domain.service;

import com.amaap.trooptraining.TrooperBuilder;
import com.amaap.trooptraining.domain.ArmyCamp;
import com.amaap.trooptraining.domain.Barrack;
import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exception.*;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainTrooperTest {

    TrooperBuilder trooperBuilder = new TrooperBuilder();

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
    void shouldBeAbleToTrainMultipleTroopersAndAddToArmyCamp() throws InvalidTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException, InterruptedException, InvalidTrooperPropertiesException, InvalidTrooperQueueException {
        // arrange
        Queue<Trooper> troopersQueue = trooperBuilder.getTroopers();
        Barrack barrack = new Barrack(10);
        ArmyCamp armyCamp = new ArmyCamp();
        TrainTrooper trainTrooper = new TrainTrooper(barrack, armyCamp);

        // act
        barrack.addTrooper(troopersQueue);
        boolean isTrained = trainTrooper.trainTroopers();
        int trainedArcherCount = armyCamp.getArcherCount();
        int trainedBarbarianCount = armyCamp.getBarbarianCount();

        // assert
        assertTrue(isTrained);
        assertEquals(4, trainedArcherCount);
        assertEquals(4, trainedBarbarianCount);
    }


}
