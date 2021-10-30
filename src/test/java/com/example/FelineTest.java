package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void eatMeat_ReturnPredatorsFoodList() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualPredatorsFoodList = feline.eatMeat();
        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }

    @Test
    public void getFamily_returnFamilyFeline() {
        Feline feline = new Feline();
        final String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithoutParameters_returnOne() {
        Feline feline = new Feline();
        final int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void  getKittensWithParameters_returnParameters() {
        Feline feline = new Feline();
        final int expectedKittensCount = 5;
        int actualKittensCount = feline.getKittens(expectedKittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

}
