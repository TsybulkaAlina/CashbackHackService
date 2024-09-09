package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));   // Ожидаем 100
        Assert.assertEquals(0, service.remain(1000));     // Ожидаем 0
        Assert.assertEquals(900, service.remain(1100));   // Ожидаем 900

        // Падающий тест для выявления ошибки
        Assert.assertEquals(1000, service.remain(1000));  // Ожидаем 0, но возвращает 1000
    }
}
