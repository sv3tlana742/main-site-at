package ru.geekbrains.main.site.at.junit.example.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysFailTest {


    @Test
    void example() {
        Assertions.fail("тест упал");
    }
}

