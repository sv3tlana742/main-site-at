package ru.geekbrains.main.site.at.junit.example.annotations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeOutTest {

    @Timeout(1)
    @Test
    void example() throws InterruptedException {
        sleep(1000);
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }
}

