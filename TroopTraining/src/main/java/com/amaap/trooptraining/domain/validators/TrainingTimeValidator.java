package com.amaap.trooptraining.domain.validators;

public class TrainingTimeValidator {

    public static boolean validateTime(int time) {
        if ((!isTimeEqualToZero(time)) && time == 3 || time == 6) {
            return true;
        }
        return false;
    }

    public static boolean isTimeEqualToZero(int time) {
        return time == 0;
    }
}
