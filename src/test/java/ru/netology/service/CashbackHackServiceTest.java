package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
        Assert.assertEquals(service.remain(1000), 0);
        Assert.assertEquals(service.remain(1100), 900);
    }
}


