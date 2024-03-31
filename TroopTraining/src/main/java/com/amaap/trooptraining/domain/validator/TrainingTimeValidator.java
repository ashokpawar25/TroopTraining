package com.amaap.trooptraining.domain.validator;

public class TrainingTimeValidator {

    public static boolean validateTime(int time) {
        if ((!isTimeEqualToZero(time)) && time == 3 || time == 6) {
            return false;
        }
        return true;
    }

    public static boolean isTimeEqualToZero(int time) {
        return time == 0;
    }
}
