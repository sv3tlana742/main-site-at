package ru.geekbrains.main.site.at.junit.example.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NumberHamcrestTest {
    @Test
    void name() {
        double numberActual = 100.00;
        double numberExpected = 99.00;
        assertThat(numberActual,allOf(
                greaterThan(numberExpected),
                lessThanOrEqualTo(100.00),
                closeTo(numberExpected, 1)
        ));
    }
}
