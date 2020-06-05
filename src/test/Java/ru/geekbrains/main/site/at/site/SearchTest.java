package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.SearchPage;
import ru.geekbrains.main.site.at.site.Base.BaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {

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