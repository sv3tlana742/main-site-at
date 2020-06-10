package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.SearchPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Feature("Поиск")

public class SearchWorkTest extends BaseTest {

    @DisplayName("Проверка отображения блоко на странице")
    @Test
    void partitions() {
        SearchPage searchPage = new SearchPage(driver);

        searchPage.checkPartitionExists("Профессии");
        searchPage.checkPartitionExists("Курсы");
        searchPage.checkPartitionExists("Вебинары");
        searchPage.checkPartitionExists("Блоги");
        searchPage.checkPartitionExists("Форум");
        searchPage.checkPartitionExists("Тесты");
        searchPage.checkPartitionExists("Проекты и компании");
    }
    @DisplayName("Проверка отображения колличества контента")
    @Test
    void partitionsData() {
        SearchPage searchPage = new SearchPage(driver);

        assertThat(
                searchPage.getPartitionCount("Профессии"),
                allOf(
                        greaterThanOrEqualTo(2)
                )
        );
        assertThat(
                searchPage.getPartitionCount("Курсы"),
                allOf(
                        greaterThan(15)
                )
        );
        assertThat(
                searchPage.getPartitionCount("Вебинары"),
                allOf(
                        greaterThan(180),
                        lessThan(300)
                )
        );
        assertThat(
                searchPage.getFirstEventTitle(),
                containsString("Java Junior. Что нужно знать для успешного собеседования?")
        );
        assertThat(
                searchPage.getPartitionCount("Блоги"),
                allOf(
                        greaterThan(300)
                )
        );
        assertThat(
                searchPage.getPartitionCount("Форум"),
                allOf(
                        not(equalTo(350))
                )
        );
        assertThat(
                searchPage.getPartitionCount("Тесты"),
                allOf(
                        not(equalTo(0))
                )
        );
        assertThat(
                searchPage.getCompanyGBText(),
                containsString("GeekBrains")
        );
    }
}