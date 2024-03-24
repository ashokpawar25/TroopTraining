package com.amaap.trooptraining.validator;

import com.amaap.trooptraining.domain.validators.TrainingCostValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainingCostValidatorTest {
    @Test
    void validateTimeEqualToZero() {
        //Arrange
        int time = 0;

        //Act
        boolean result = TrainingCostValidator.isCostZero(time);

        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    void shouldCheckValidCost() {
        //Assert
        Assertions.assertFalse(TrainingCostValidator.validateCost(0));
        Assertions.assertTrue(TrainingCostValidator.validateCost(10));
        Assertions.assertTrue(TrainingCostValidator.validateCost(20));
    }
}
