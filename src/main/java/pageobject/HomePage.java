package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

// Класс содержит локаторы, элементы с главной страницы
public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage() {
    }
    // Локаторы на главной странице
    private By acceptCookieButton = By.id("rcc-confirm-button");  // кнопка согласия использования куки
    private By imgScooter = By.xpath("//img[@alt='Scooter blueprint']"); // элемент самокат
    private By headingQuest = By.xpath("//div[text() = 'Вопросы о важном']"); // элемент заголовка Вопросы о важном
    private By orderButtonTop = By.className("Button_Button__ra12g"); // кнопка заказать вверху сайта
    private By orderButtonDown = By.xpath("//button[contains(@class, 'Button_Middle')]"); // кнопка заказать внизу сайта
    // Локаторы из списка вопросов и ответов
    private By listQuestions = By.xpath("//*[@class='accordion__button']"); // элемент вопросов
    private By listAnswers = By.xpath("//div[@data-accordion-component='AccordionItemPanel']"); // элемент ответов
    // Преобразование локаторов в вебэлементы
    public By getImage() {
        return imgScooter;
    }
    public WebElement getCookie() {
        return driver.findElement(acceptCookieButton);
    }
    public WebElement getModQuest() {
        return driver.findElement(headingQuest);
    }
    public By getOrderedTop() {
        return orderButtonTop;
    }
    public By getOrderedDown() {
        return orderButtonDown;
    }
    // Коллекция из элементов вопросов
    public List<WebElement> getListQuestions() {
        return driver.findElements(listQuestions);
    }
    // Коллекция из элементов ответов
    public List<WebElement> getListAnswer() {
        return driver.findElements(listAnswers);
    }
}
