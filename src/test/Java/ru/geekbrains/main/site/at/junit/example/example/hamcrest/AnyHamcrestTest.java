package ru.geekbrains.main.site.at.junit.example.example.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AnyHamcrestTest {
    @Test
    void name() {
        double numberActual = 100.00;
        double numberExpected = 99.00;

        assertThat(numberActual,
                allOf(
                        greaterThan(numberExpected),
                        lessThanOrEqualTo(101.00),
                        closeTo(numberExpected, 1)
                ));
    }

    @Test
    public void givenString_whenConditions_thenCorrect() {
        String string = "Вебинары";
        assertThat(string,
                anyOf(containsString("ин"),
                        endsWith("ры")));
    }

    @Test
    public void givenNumber_whenConditions_thenCorrect() {
        Integer intVal = 7;
        assertThat(intVal,
                allOf(
                        greaterThan(5),
                        lessThanOrEqualTo(7),
                        not(equalTo(6))));
    }
}
