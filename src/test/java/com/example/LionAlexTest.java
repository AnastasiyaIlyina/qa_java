package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    private LionAlex lionAlex;

    @Before
    public void prepareDate() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void getFriendsReturnFriendsList() throws Exception {
        List<String> expectedFriendsList = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        List<String> actualFriendsList = lionAlex.getFriends();
        Assert.assertEquals(expectedFriendsList, actualFriendsList);
    }

    @Test
    public void getPlaceOfLivingReturnNYZoo() throws Exception {
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittensWithoutParametersReturnZeroResult() throws Exception {
        int expectedKittensCount = 0;
        int actualKittensCount = lionAlex.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

}