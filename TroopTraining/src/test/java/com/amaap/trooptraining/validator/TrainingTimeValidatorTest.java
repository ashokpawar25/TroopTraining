package com.amaap.trooptraining.validator;

import com.amaap.trooptraining.domain.validator.TrainingTimeValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingTimeValidatorTest {
    @Test
    void shouldBeAbleToCheckTrainingTimeIsZeroOrNot() {
        // arrange
        int time = 0;

        // act
        boolean result = TrainingTimeValidator.isTimeEqualToZero(time);

        // assert
        assertTrue(result);
    }

    @Test
    void shouldBeAbleToValidateTrainingTime() {
        // assert
        assertFalse(!TrainingTimeValidator.validateTime(0));
        assertTrue(!TrainingTimeValidator.validateTime(3));
        assertTrue(!TrainingTimeValidator.validateTime(6));
    }
}
