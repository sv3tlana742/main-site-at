package ru.geekbrains.main.site.at.junit.example.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Параметризованные тесты")
public class ParameterizedExampleTest {

    @DisplayName("Пример хардкода данных")
    @ParameterizedTest
    @ValueSource(strings = { "Hello ", "Word " })
    void hardcode(String name) {
        System.out.println(name);
        assertTrue(true);
    }

    @DisplayName("Пример получения данных из метода")
    @ParameterizedTest
    @MethodSource("stringProvider")
    void method(String name) {
        System.out.println(name);
        assertTrue(true);
    }

    static Stream<String>stringProvider(){
        return Stream.of("Hello ", "Word ");
    }
}

