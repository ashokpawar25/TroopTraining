package com.amaap.trooptraining.domain;

import com.amaap.trooptraining.domain.exception.BarrackOverFlowException;
import com.amaap.trooptraining.domain.exception.InvalidTrooperQueueException;

import java.util.LinkedList;
import java.util.Queue;

public class Barrack
{
    private Queue<Trooper> trooperQueue ;
    private final int maxCapacity;
    public Barrack(int maxCapacity)
    {
        this.trooperQueue = new LinkedList<>();
        this.maxCapacity = maxCapacity;
    }

    public void addTrooper(Queue<Trooper> troopers) throws BarrackOverFlowException, InvalidTrooperQueueException {
        if(troopers.size()>maxCapacity) throw new BarrackOverFlowException("Barrack can have maximum 10 troopers");
        if(troopers.size()<= 0) throw new InvalidTrooperQueueException("Queue should have at least one trooper");
        trooperQueue.addAll(troopers);
    }

    public Queue<Trooper> getTrooperList()
    {
        return trooperQueue;
    }
}
