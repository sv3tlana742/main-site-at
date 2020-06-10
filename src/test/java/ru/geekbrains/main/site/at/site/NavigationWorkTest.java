package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.site.base.BaseTest;
import ru.geekbrains.main.site.at.page.HomePage;

import java.util.stream.Stream;

@Feature("Навигация")
@DisplayName("Проверка навигации")

public class NavigationWorkTest extends BaseTest {

    static Stream<String> stringProviderNotPopUp(){
        return Stream.of(
                "Вебинары",
                "Форум",
                "Тесты",
                "Карьера"
        );
    }

    static Stream<String> stringProviderPopUp(){
        return Stream.of(
                "Курсы",
                "Блог"
        );
    }
        @Description("Тесты, проверяющие функционал без Pop-up")
        @DisplayName("Нажатие на элемент навигации")
        @ParameterizedTest(name = "{index} => Нажатие на: {0}")
        @MethodSource("stringProviderNotPopUp")
        void checkNavigation1(String name){
            new HomePage(driver)
                    .getNavigation().clickButton(name)
                    .checkNamePage(name);
        }
        @Description("Тесты, проверяющие функционал Pop-up")
        @DisplayName("Нажатие на элемент навигации")
        @ParameterizedTest(name = "{index} => Нажатие на: {0}")
        @MethodSource("stringProviderPopUp")
        void checkNavigation2(String name){
            new HomePage(driver)
                    .getNavigation().clickButton(name)
                    .closedPopUp()
                    .checkNamePage(name);
        }
}

