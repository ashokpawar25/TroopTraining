package com.amaap.trooptraining.domain.validators;

public class TrainingCostValidator
{

    public static boolean validateCost(int cost)
    {
        if(!isCostZero(cost) && cost == 10 || cost == 20)
        {
            return true;
        }
        return false;
    }

    public static boolean isCostZero(int cost)
    {
        return cost == 0;
    }
}
