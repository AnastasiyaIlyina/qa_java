package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriends_returnFriendsList() throws Exception {
        LionAlex lionAlex = new LionAlex (feline);
        List<String> expectedFriendsList = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        List<String> actualFriendsList = lionAlex.getFriends();
        Assert.assertEquals(expectedFriendsList, actualFriendsList);
    }

    @Test
    public void getPlaceOfLiving_returnNYZoo() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittensWithoutParameters_returnZeroResult() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expectedKittensCount = 0;
        int actualKittensCount = lionAlex.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

}