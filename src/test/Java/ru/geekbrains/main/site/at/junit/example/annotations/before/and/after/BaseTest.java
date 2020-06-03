package ru.geekbrains.main.site.at.junit.example.annotations.before.and.after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void beforeAllBaseTest() {
        System.out.println("BeforeAll: BaseTest ");
    }

    @BeforeEach
    void baseTestBefore() {
        System.out.println("BeforeEach " + getClass().getName());
    }

    @AfterEach
    void baseTestTearDown() {
        System.out.println("AfterEach BaseTest " + getClass().getName());
    }

    @AfterAll
    static void afterAllBaseTest() {
        System.out.println("AfterAll: BaseTest ");
    }
}
