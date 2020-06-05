package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.site.Base.BaseTest;
import ru.geekbrains.main.site.at.page.HomePage;

import java.util.stream.Stream;

@DisplayName("Проверка навигации")

public class NavigationTest extends BaseTest {

    static Stream<String> stringProvider(){
        return Stream.of(
                "Вебинары",
                "Форум",
                "Блог",
                "Тесты",
                "Карьера",
                "Курсы"
        );
    }
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProvider")
    void checkNavigation(String name){
        new HomePage(driver)
                .getNavigation().clickButton(name)
                .checkNamePage(name);

//        driver.findElement(By.cssSelector("button>[class=\"svg-icon icon-popup-close-button \"]")).click();

    }
}

