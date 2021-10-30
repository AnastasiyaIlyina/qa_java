package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound_ReturnSoundMeow() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void getFood_ReturnPredatorsFoodList() throws Exception {
        Cat cat = new Cat(this.feline);
        List<String> expectedFoodList = List.of("Орехи", "Желуди");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodList);

        List<String> actualPredatorsFoodList = cat.getFood();

        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }

}

