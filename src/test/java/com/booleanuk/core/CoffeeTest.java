package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeTest {
    @Test
    void getTypeShouldBeNormal() {
        Coffee coffee = new Coffee();

        Assertions.assertEquals(COFFEETYPE.BLACK, coffee.getType());
    }
}