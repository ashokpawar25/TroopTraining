package com.amaap.trooptraining.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrooperTest {
    @Test
    void shouldAbleToCreateTrooper() {
        //Arrange
        Trooper expectedTrooper = new Trooper(3, 10, Weapon.Sword);

        //Act
        Trooper actualTrooper = Trooper.Create(3, 10, Weapon.Sword);

        //Assert
        Assertions.assertEquals(expectedTrooper, actualTrooper);
    }
}
