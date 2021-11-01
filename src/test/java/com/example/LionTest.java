package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;

    @Before
    public void prepareDate() throws Exception {
        lion = new Lion(feline, "Самец");
    }

    @Mock
    Feline feline;

    @Test
    public void getKittensWithoutParametersReturnIntResult() throws Exception {
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittensCount);

        int actualKittensCount = lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodReturnPredatorsFoodList() throws Exception {
        final String animalKind = "Хищник";

        List<String> expectedFoodList = List.of("KiteKat", "Sheba", "ROYAL CANIN");
        Mockito.when(feline.getFood(animalKind)).thenReturn(expectedFoodList);

        List<String> actualPredatorsFoodList = lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(animalKind);
        Mockito.verify(feline).getFood(animalKind);

        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }
}