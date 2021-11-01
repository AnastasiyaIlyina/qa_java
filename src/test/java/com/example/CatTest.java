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
public class CatTest {

    private Cat cat;

    @Before
    public void prepareDate() throws Exception {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnSoundMeow() {
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void getFoodReturnPredatorsFoodList() throws Exception {
        List<String> expectedFoodList = List.of("Орехи", "Желуди");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodList);

        List<String> actualPredatorsFoodList = cat.getFood();

        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }

}

