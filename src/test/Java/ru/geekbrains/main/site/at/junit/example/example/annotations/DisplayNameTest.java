package ru.geekbrains.main.site.at.junit.example.example.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Простой пример тестового набора")
public class DisplayNameTest {

    @DisplayName("Простой пример ТК 1")
    @Test
    void example1() {
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }

    @DisplayName("Простой пример ТК 2DisplayNameTest")
    @Test
    void example2() {
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }
}

