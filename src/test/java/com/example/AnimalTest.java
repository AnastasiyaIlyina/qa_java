package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKindInput;
    private final List<String> expectedFoodListReturn;

    public AnimalTest(String animalKindInput, List<String> expectedFoodListReturn) {
        this.animalKindInput = animalKindInput;
        this.expectedFoodListReturn = expectedFoodListReturn;
    }

    @Parameterized.Parameters
    public static Object[][] getSexParameters() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения") },
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodHerbivore_returnHerbivoreFoodList() throws Exception {
        Animal animal = new Animal();
        List<String> actualHerbivoreFoodList = animal.getFood(animalKindInput);
        Assert.assertEquals(expectedFoodListReturn, actualHerbivoreFoodList);
    }

    @Test(expected = Exception.class)
    public void getFood_throwsException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Поедатель снега");
    }

    @Test
    public void getFamily_returnAnswer() {
        Animal animal = new Animal();
        String expectedFamilyAnswer = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamilyAnswer = animal.getFamily();
        Assert.assertEquals(expectedFamilyAnswer, actualFamilyAnswer);
    }

}
