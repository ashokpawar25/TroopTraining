package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.TrooperBuilder;
import com.amaap.trooptraining.domain.exceptions.*;
import com.amaap.trooptraining.domain.model.Archer;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BarrackTest {

    TrooperBuilder trooperBuilder = new TrooperBuilder();

    @Test
    void shouldBeAbleToAddTrooperInBarrack() throws InvalidTrainingTimeException, InvalidTrainingCostException, BarrackOverFlowException, InvalidTrooperPropertiesException, InvalidTrooperQueueException {
        // arrange
        Trooper trooper = new Archer();
        List<Trooper> troopers = List.of(trooper);
        Queue<Trooper> trooperQueue = new LinkedList<>();
        trooperQueue.addAll(troopers);
        // act
        Barrack barrack = new Barrack(10);
        barrack.addTrooper(trooperQueue);
        Queue<Trooper> actualTrooperList = barrack.getTrooperList();

        // assert
        assertEquals(trooper, actualTrooperList.peek());
    }

    @Test
    void shouldBeAbleToThrowExceptionWhenEmptyQueueIsPassed() {
        // arrange
        Queue<Trooper> trooperQueue = new LinkedList<>();
        // act
        Barrack barrack = new Barrack(10);

        // assert
        assertThrows(InvalidTrooperQueueException.class, () -> barrack.addTrooper(trooperQueue));
    }

    @Test
    void shouldBeAbleToGetTroopersInQueueFromBarrack() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException, BarrackOverFlowException, InvalidTrooperQueueException {
        // arrange
        Queue<Trooper> trooperQueue = trooperBuilder.getTroopers();
        Barrack barrack = new Barrack(10);

        // act
        barrack.addTrooper(trooperQueue);
        Queue<Trooper> actualTrooperList = barrack.getTrooperList();

        // assert
        assertEquals(trooperQueue, actualTrooperList);
    }

    @Test
    void shouldBeAbleToThrowExceptionWhenTryToAddTroopersMoreThanBarrackCapacity() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        // arrange
        Queue<Trooper> trooperQueue = trooperBuilder.getMoreTroopers();
        Barrack barrack = new Barrack(10);

        // act & assert
        Exception exception = assertThrows(BarrackOverFlowException.class, () -> barrack.addTrooper(trooperQueue));
        assertEquals("Barrack can have maximum 10 troopers", exception.getMessage());
    }
}
