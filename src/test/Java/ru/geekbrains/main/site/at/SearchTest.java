package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.Base.BaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {

    @Test
    void events() {
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        WebElement professions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = driver.findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = driver.findElement(By.xpath(".//header/h2[text()='Вебинары']"));
        WebElement blogs = driver.findElement(By.xpath(".//header/h2[text()='Блоги']"));
        WebElement topic = driver.findElement(By.xpath(".//header/h2[text()='Форум']"));
        WebElement tests = driver.findElement(By.xpath(".//header/h2[text()='Тесты']"));
        WebElement projectAndCompany = driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']"));

        wait10second.until(ExpectedConditions.textToBePresentInElement(professions, "Профессии"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(courses, "Курсы"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(events, "Вебинары"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(blogs, "Блоги"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(topic, "Форум"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(tests, "Тесты"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(projectAndCompany, "Проекты и компании"));

        WebElement professionsCount = driver.findElement(By.cssSelector("[id=\"professions\"] ul span"));
        WebElement coursesCount = driver.findElement(By.xpath(".//header/h2[text()='Курсы']/following-sibling::*[1]//span"));
        WebElement eventsCount = driver.findElement(By.xpath(".//header/h2[text()='Вебинары']/following-sibling::*[1]//span"));
        WebElement eventFirst = driver.findElement(By.xpath(".//header/h2[text()='Вебинары']/../../following-sibling::*//*[contains(@class,\"event-item\")][1]//a[contains(@class,\"search_text\")]"));
        WebElement blogsCount = driver.findElement(By.xpath(".//header/h2[text()='Блоги']/following-sibling::*[1]//span"));
        WebElement topicCount = driver.findElement(By.xpath(".//header/h2[text()='Форум']/following-sibling::*[1]//span"));
        WebElement testsCount = driver.findElement(By.xpath(".//header/h2[text()='Тесты']/following-sibling::*[1]//span"));
        WebElement companyGB = driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']/../../following-sibling::*//*[contains(text(),\"GeekBrains\")]"));

        assertThat(
                Integer.parseInt(professionsCount.getText()),
                allOf(
                        greaterThanOrEqualTo(2)
                )
        );
        assertThat(
                Integer.parseInt(coursesCount.getText()),
                allOf(
                        greaterThan(15)
                )
        );
        assertThat(
                Integer.parseInt(eventsCount.getText()),
                allOf(
                        greaterThan(180),
                        lessThan(300)
                )
        );
        String nameActual = "Java Junior. Что нужно знать для успешного собеседования?";
        assertThat(
                nameActual,
                containsString(eventFirst.getText())
        );

        assertThat(
                Integer.parseInt(blogsCount.getText()),
                allOf(
                        greaterThan(300)
                )
        );
        assertThat(
                Integer.parseInt(topicCount.getText()),
                allOf(
                        not(equalTo(350))
                )
        );

        assertThat(
                Integer.parseInt(testsCount.getText()),
                allOf(
                        not(equalTo(0))
                )
        );

        assertThat(
                companyGB.getText(),
                containsString("GeekBrains")
        );


//        Assertions.assertTrue(Integer.parseInt(professionsCount.getText()) >= 2);
//        Assertions.assertTrue(Integer.parseInt(coursesCount.getText()) > 15);
//        int eventsCountInt = Integer.parseInt(eventsCount.getText());
//        Assertions.assertTrue(eventsCountInt > 180 && eventsCountInt < 300);
//        Assertions.assertEquals("Java Junior. Что нужно знать для успешного собеседования?", eventFirst.getText());
//        Assertions.assertTrue(Integer.parseInt(blogsCount.getText()) > 300);
//        Assertions.assertNotEquals(350, Integer.parseInt(topicCount.getText()));
//        Assertions.assertNotEquals(0, Integer.parseInt(testsCount.getText()));
//        Assertions.assertTrue(companyGB.getText().contains("GeekBrains"));
    }
}
