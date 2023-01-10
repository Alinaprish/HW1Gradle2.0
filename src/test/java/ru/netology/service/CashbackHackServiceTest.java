package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {

        CashbackHackService service = new CashbackHackService();

        int expected = 50;
        int actual = service.remain(950);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void remainTwo() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(1000);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void remainFree() {

        CashbackHackService service = new CashbackHackService();

        int expected = 150;
        int actual = service.remain(850);

        assertEquals(actual, expected);

    }

}