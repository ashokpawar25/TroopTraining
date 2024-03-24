package com.amaap.trooptraining.validator;

import com.amaap.trooptraining.domain.validators.TrainingTimeValidator;
import com.sun.source.tree.AssertTree;
import com.sun.source.tree.BreakTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

public class TrainingTimeValidatorTest {
    //TrainingTimeValidator trainingTimeValidator = new TrainingTimeValidator();

    @Test
    void checkTimeIsZero() {
        //Arrange
        int time = 0;

        //Act
        boolean result = TrainingTimeValidator.isTimeEqualToZero(time);

        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    void shouldAbleToValidateCorrectTrainingTime() {
        //Assert
        Assertions.assertFalse(TrainingTimeValidator.validateTime(0));
        Assertions.assertTrue(TrainingTimeValidator.validateTime(3));
        Assertions.assertTrue(TrainingTimeValidator.validateTime(6));
    }
}
