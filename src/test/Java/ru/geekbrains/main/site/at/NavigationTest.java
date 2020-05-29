package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.Base.BaseTest;

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

    @Test
    void courses() {

        WebElement buttonCourses = driver.findElement(By.cssSelector("[id='nav'] [href='/courses']"));
        buttonCourses.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Курсы", textNamePage.getText());
    }

//        вебинары href="/events"
    @Test
    void events() {
        WebElement buttonEvents = driver.findElement(By.cssSelector("[id='nav'] [href='/events']"));
        buttonEvents.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class='gb-header__title']"));
        Assertions.assertEquals("Вебинары", textNamePage.getText());
    }
//        Форум href="/topics"
    @Test
    void topics() {
        WebElement topics = driver.findElement(By.cssSelector("[id='nav'] [href='/topics']"));
        topics.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class='gb-header__title']"));
        Assertions.assertEquals("Форум", textNamePage.getText());
    }
//        блог href="/posts"
    @Test
    void posts() {
        WebElement posts = driver.findElement(By.cssSelector("[id='nav'] [href='/posts']"));
        posts.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class='gb-header__title']"));
        Assertions.assertEquals("Блог", textNamePage.getText());
    }
//        тесты href="/tests"
    @Test
    void tests() {
        WebElement tests = driver.findElement(By.cssSelector("[id='nav'] [href='/tests']"));
        tests.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class='gb-header__title']"));
        Assertions.assertEquals("Тесты", textNamePage.getText());
    }
//        карьера href="/career"
    @Test
    void career() {
        WebElement career = driver.findElement(By.cssSelector("[id='nav'] [href='/career']"));
        career.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class='gb-header__title']"));
        Assertions.assertEquals("Карьера", textNamePage.getText());
    }
}
