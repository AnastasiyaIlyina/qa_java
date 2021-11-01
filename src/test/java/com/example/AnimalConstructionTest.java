package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalConstructionTest {

    private final String animalKindInput;
    private final List<String> expectedFoodListReturn;

    public AnimalConstructionTest(String animalKindInput, List<String> expectedFoodListReturn) {
        this.animalKindInput = animalKindInput;
        this.expectedFoodListReturn = expectedFoodListReturn;
    }

    @Parameterized.Parameters
    public static Object[][] getSexParameters() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodHerbivoreReturnHerbivoreFoodList() throws Exception {
        Animal animal = new Animal();
        List<String> actualHerbivoreFoodList = animal.getFood(animalKindInput);
        Assert.assertEquals(expectedFoodListReturn, actualHerbivoreFoodList);
    }

}
