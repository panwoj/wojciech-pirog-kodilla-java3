package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CheckStatistics checkStatistics = new CheckStatistics(statisticsMock);
        ArrayList<String> usersNamesList = new ArrayList<String>();
        usersNamesList.add("j21e");
        usersNamesList.add("johnny32");
        usersNamesList.add("jane5");
        usersNamesList.add("paul_smith");
        usersNamesList.add("ram9");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(21);
        when(statisticsMock.commentsCount()).thenReturn(40);
        //When
        checkStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5, checkStatistics.getUsersNumber());
        Assert.assertEquals(21, checkStatistics.getPostsNumber());
        Assert.assertEquals(40, checkStatistics.getCommentsNumber());
        Assert.assertEquals(21/5, checkStatistics.getAveragePostsNumberOnUser(), 0.0);
        Assert.assertEquals(40/5, checkStatistics.getAverageCommentsNumberOnUser(), 0.0);
        Assert.assertEquals(40/21, checkStatistics.getAverageCommentsNumberOnPosts(), 0.0);
    }
}
