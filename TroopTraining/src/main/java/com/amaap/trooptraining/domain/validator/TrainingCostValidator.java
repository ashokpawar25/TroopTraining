package com.amaap.trooptraining.domain.validator;

public class TrainingCostValidator
{

    public static boolean validateCost(int cost)
    {
        if(!isCostZero(cost) && cost == 10 || cost == 20)
        {
            return false;
        }
        return true;
    }

    public static boolean isCostZero(int cost)
    {
        return cost == 0;
    }
}
