package ru.geekbrains.main.site.at.junit.example.example.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringHamcrestTest {
    @Test
    void given2StringsWhenEqualThenCorrect() {
        String nameActual = "Moscow";
        String nameExpected = "moscow";
        assertThat(nameActual, equalToIgnoringCase(nameExpected));
    }
    @Test
    void given2StringsWhenEqualIgnWSThenCorrect() {
        String a = " Hi  Moscow  ";
        assertThat(a, equalToCompressingWhiteSpace("Hi Moscow"));
    }
}
