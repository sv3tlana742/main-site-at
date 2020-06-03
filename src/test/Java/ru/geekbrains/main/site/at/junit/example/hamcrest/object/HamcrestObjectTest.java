package ru.geekbrains.main.site.at.junit.example.hamcrest.object;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestObjectTest {

    @Test
    public void givenDog_whenToString_thenReturnsSound() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasToString("gaf"));
    }

    @Test
    public void givenSubclass_whenTypeCompatable_thenTrue() {
        assertThat(Dog.class, typeCompatibleWith(Animal.class));
        assertThat(Integer.class, typeCompatibleWith(Number.class));
    }

    @Test
    public void givenSubclass_whenChecked_thenTrue() {
        Dog dog = new Dog("gaf");
        assertThat(dog, instanceOf(Animal.class));
    }

    @Test
    public void givenBean__whenHasValue__thenCorrect() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasProperty("sound"));
    }

    @Test
    public void givenBean__whenHasCorrectValue__thenCorrect() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasProperty("sound", equalTo("gaf")));
    }

    @Test
    public void given2Beans__whenHavingSameValues__thenCorrect() {
        Dog dog1 = new Dog("gaf");
        Dog dog2 = new Dog("gaf");
        assertThat(dog1, samePropertyValuesAs(dog2));
    }
}
