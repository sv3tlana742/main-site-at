package ru.geekbrains.main.site.at.junit.example.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {

    @Test
    void example() {
        assertAll("пользователь",
                () -> assertEquals("Иван", "Петр"),
                () -> assertEquals("Иванов", "Васильев")
        );
    }
}
