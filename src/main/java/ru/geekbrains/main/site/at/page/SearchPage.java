package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    @FindBy(css = "[id=\"professions\"] h2")
    private WebElement professions;
    @FindBy(xpath = ".//header/h2[text()='Курсы']")
    private WebElement courses;
    @FindBy(xpath = ".//header/h2[text()='Вебинары']")
    private WebElement events;
    @FindBy(xpath = ".//header/h2[text()='Блоги']")
    private WebElement blogs;
    @FindBy(xpath = ".//header/h2[text()='Форум']")
    private WebElement topic;
    @FindBy(xpath = ".//header/h2[text()='Тесты']")
    private WebElement tests;
    @FindBy(xpath = ".//header/h2[text()='Проекты и компании']")
    private WebElement projectAndCompany;

    @FindBy(css = "[id=\"professions\"] ul span")
    private WebElement professionsCount;
    @FindBy(xpath = ".//header/h2[text()='Курсы']/following-sibling::*[1]//span")
    private WebElement coursesCount;
    @FindBy(xpath = ".//header/h2[text()='Вебинары']/following-sibling::*[1]//span")
    private WebElement eventsCount;
    @FindBy(xpath = ".//header/h2[text()='Вебинары']/../../following-sibling::*//*[contains(@class,\"event-item\")][1]//a[contains(@class,\"search_text\")]")
    private WebElement eventFirst;
    @FindBy(xpath = ".//header/h2[text()='Блоги']/following-sibling::*[1]//span")
    private WebElement blogsCount;
    @FindBy(xpath = ".//header/h2[text()='Форум']/following-sibling::*[1]//span")
    private WebElement topicCount;
    @FindBy(xpath = ".//header/h2[text()='Тесты']/following-sibling::*[1]//span")
    private WebElement testsCount;
    @FindBy(xpath = ".//header/h2[text()='Проекты и компании']/../../following-sibling::*//*[contains(text(),\"GeekBrains\")]")
    private WebElement companyGB;

    private WebDriverWait wait10second;

    public SearchPage(WebDriver driver) {
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("[id=\"professions\"] h2")), "Профессии"));

        PageFactory.initElements(driver, this);

        wait10second = new WebDriverWait(driver, 10);
    }
    @Step("Ожидание открытия страницы")
    public void checkPartitionExists(String name) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(getPartition(name), name));
    }

    public String getFirstEventTitle() {
        return eventFirst.getText();
    }

    public String getCompanyGBText() {
        return companyGB.getText();
    }

    @Step("Приведение элементов страницы поиска к типу String")
    public int getPartitionCount(String name) {
        WebElement element;

        switch (name) {
            case "Профессии": {
                element = professionsCount;
                break;
            }
            case "Курсы": {
                element = coursesCount;
                break;
            }
            case "Вебинары": {
                element = eventsCount;
                break;
            }
            case "Блоги": {
                element = blogsCount;
                break;
            }
            case "Форум": {
                element = topicCount;
                break;
            }
            case "Тесты": {
                element = testsCount;
                break;
            }
            default: {
                throw new RuntimeException("Раздел не найден: " + name);
            }
        }

        return Integer.parseInt(element.getText());
    }

    private WebElement getPartition(String name) {
        switch (name) {
            case "Профессии": {
                return professions;
            }
            case "Курсы": {
                return courses;
            }
            case "Вебинары": {
                return events;
            }
            case "Блоги": {
                return blogs;
            }
            case "Форум": {
                return topic;
            }
            case "Тесты": {
                return tests;
            }
            case "Проекты и компании": {
                return projectAndCompany;
            }
            default: {
                throw new RuntimeException("Раздел не найден: " + name);
            }
        }
    }
}
