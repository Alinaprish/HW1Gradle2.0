package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(0, actual);
    }

    @Test
    public void testRemainTwo() {

        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(200, actual);
    }

    @Test
    public void testRemainFree() {

        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(100, actual);
    }
}