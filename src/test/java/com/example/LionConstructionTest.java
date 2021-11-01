package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionConstructionTest {

    private final String sexInput;
    private final boolean expectedSexReturn;

    public LionConstructionTest(String sexInput, boolean expectedSexReturn) {
        this.sexInput = sexInput;
        this.expectedSexReturn = expectedSexReturn;
    }

    @Parameterized.Parameters
    public static Object[][] getSexParameters() {
        return new Object[][] {
            {"Самец", true},
            {"Самка", false},
            {"Туманный еж", false},
        };
    }

    @Test
    public void doesHaveManeReturnBooleanResult() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        try {
            Lion lion = new Lion(feline, sexInput);
            boolean resultSex = lion.doesHaveMane();
            Assert.assertEquals(expectedSexReturn, resultSex);
        } catch (Exception exception) {
            Assert.assertTrue(!sexInput.equals("Самец") && !sexInput.equals("Самка"));
        }
    }

}