package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensWithoutParameters_returnIntResult() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittensCount);

        int actualKittensCount = lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFood_ReturnPredatorsFoodList() throws Exception {
        final String animalKind = "Хищник";
        Lion lion = new Lion(feline, "Самец");

        List<String> expectedFoodList = List.of("KiteKat", "Sheba", "ROYAL CANIN");
        Mockito.when(feline.getFood(animalKind)).thenReturn(expectedFoodList);

        List<String> actualPredatorsFoodList = lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(animalKind);
        Mockito.verify(feline).getFood(animalKind);

        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }
}


