package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, 0);
    }

    @org.testng.annotations.Test
    public void testRemainTwo() {

        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(actual, 200);
    }

    @org.testng.annotations.Test
    public void testRemainFree() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, 0);
    }
}