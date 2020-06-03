package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.Base.BaseTest;

import java.util.stream.Stream;

public class NavigationTest extends BaseTest {

    @Override
    @AfterEach
    protected void after() {
        WebElement header = driver.findElement(By.cssSelector("header#top-menu"));
        WebElement footer = driver.findElement(By.cssSelector("footer.site-footer"));
        wait10second.until(ExpectedConditions.visibilityOf(header));
        wait10second.until(ExpectedConditions.visibilityOf(footer));

        super.after();
    }
    @DisplayName("Проверка работы меню навигации")
    @ParameterizedTest
    @MethodSource("navigationProvider")
    void navigation (String href, String title) {
        WebElement buttonCourses = driver.findElement(By.cssSelector("[id='nav'] [href='/" + href + "']"));
        buttonCourses.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(title, textNamePage.getText());
    }

    static Stream<Arguments>navigationProvider(){
        return Stream.of(
                Arguments.of("courses", "Курсы"),
                Arguments.of("events", "Вебинары"),
                Arguments.of("topics", "Форум"),
                Arguments.of("posts", "Блог"),
                Arguments.of("tests", "Тесты"),
                Arguments.of("career", "Карьера")
        );
    }
}
