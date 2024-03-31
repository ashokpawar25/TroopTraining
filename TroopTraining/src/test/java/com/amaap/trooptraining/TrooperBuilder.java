package com.amaap.trooptraining;

import com.amaap.trooptraining.domain.Trooper;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingCostException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrainingTimeException;
import com.amaap.trooptraining.domain.exceptions.InvalidTrooperPropertiesException;
import com.amaap.trooptraining.domain.model.Archer;
import com.amaap.trooptraining.domain.model.Barbarian;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TrooperBuilder
{
    Queue<Trooper> troopersQueue = new LinkedList<>();

    public Queue<Trooper> getTroopers() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Barbarian();
        Trooper trooper3 = new Archer();
        Trooper trooper4 = new Barbarian();
        Trooper trooper5 = new Archer();
        Trooper trooper6 = new Barbarian();
        Trooper trooper7 = new Archer();
        Trooper trooper8 = new Barbarian();
        List<Trooper> troopersList = List.of(trooper1, trooper2, trooper3, trooper4,trooper5,trooper6,trooper7,trooper8);
        troopersQueue.addAll(troopersList);
        return troopersQueue;
    }

    public Queue<Trooper> getMoreTroopers() throws InvalidTrainingTimeException, InvalidTrainingCostException, InvalidTrooperPropertiesException {
        Trooper trooper1 = new Archer();
        Trooper trooper2 = new Archer();
        Trooper trooper3 = new Barbarian();
        Trooper trooper4 = new Archer();
        Trooper trooper5 = new Archer();
        Trooper trooper6 = new Barbarian();
        Trooper trooper7 = new Archer();
        Trooper trooper8 = new Barbarian();
        Trooper trooper9 = new Archer();
        Trooper trooper10 = new Barbarian();
        Trooper trooper11 = new Archer();

        List<Trooper> troopers = List.of(trooper1, trooper2, trooper3, trooper4, trooper5, trooper6, trooper7, trooper8, trooper9, trooper10, trooper11);
        troopersQueue.addAll(troopers);
        return troopersQueue;
    }

}
