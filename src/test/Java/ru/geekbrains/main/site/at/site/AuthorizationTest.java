package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.AuthorizationPage;
import ru.geekbrains.main.site.at.site.Base.BaseTest;

public class AuthorizationTest extends BaseTest {

    @Test
    void checkValidAuthorization() {
        driver.get("https://geekbrains.ru/");
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.login("login", "password")
                .checkNamePage("Главная");
    }
}
