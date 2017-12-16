package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials jack = new Millenials("Jack");
        YGeneration pamela = new YGeneration("Pamela");
        ZGeneration adam = new ZGeneration("Adam");

        //When
        String jackSharePost = jack.sharePost();
        System.out.println("Jack is sharing post " + jackSharePost);
        String pamelaSharePost = pamela.sharePost();
        System.out.println("Pamela is sharing post " + pamelaSharePost);
        String adamSharePost = adam.sharePost();
        System.out.println("Adam is sharing post " + adamSharePost);

        //Then
        Assert.assertEquals("[Using facebook]", jackSharePost);
        Assert.assertEquals("[Using twitter]", pamelaSharePost);
        Assert.assertEquals("[Using snapchat]", adamSharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials jack = new Millenials("Jack");

        //When
        String jackSharePost = jack.sharePost();
        System.out.println("Jack is sharing post " + jackSharePost);
        jack.setDefaultSocialPublisher(new TwitterPublisher());
        jackSharePost = jack.sharePost();
        System.out.println("Jack is sharing second post " + jackSharePost);

        //Then
        Assert.assertEquals("[Using twitter]", jackSharePost);
    }
}
