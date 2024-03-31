package com.amaap.trooptraining.validator;

import com.amaap.trooptraining.domain.validator.TrainingCostValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingCostValidatorTest {
    @Test
    void validateTimeEqualToZero() {
        // arrange
        int time = 0;

        // act
        boolean result = TrainingCostValidator.isCostZero(time);

        // assert
        assertTrue(result);
    }

    @Test
    void shouldCheckValidCost() {
        // assert
        assertFalse(!TrainingCostValidator.validateCost(0));
        assertTrue(!TrainingCostValidator.validateCost(10));
        assertTrue(!TrainingCostValidator.validateCost(20));
    }
}
