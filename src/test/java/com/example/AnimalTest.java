package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

    private Animal animal;

    @Before
    public void prepareDate() throws Exception {
        animal = new Animal();
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsException() throws Exception {
        animal.getFood("Поедатель снега");
    }

    @Test
    public void getFamilyReturnAnswer() {
        String expectedFamilyAnswer = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamilyAnswer = animal.getFamily();
        Assert.assertEquals(expectedFamilyAnswer, actualFamilyAnswer);
    }

}
