package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Hello!");
        Logger.getInstance().log("Bye!");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Bye!", result);
    }
}
