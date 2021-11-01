package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    private Feline feline;

    @Before
    public void prepareDate() throws Exception {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnPredatorsFoodList() throws Exception {
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualPredatorsFoodList = feline.eatMeat();
        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }

    @Test
    public void getFamilyReturnFamilyFeline() {
        final String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithoutParametersReturnOne() {
        final int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void  getKittensWithParametersReturnParameters() {
        final int expectedKittensCount = 5;
        int actualKittensCount = feline.getKittens(expectedKittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

}
