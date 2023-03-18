package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Класс содержит локаторы и вебэлементы для оформления заказа
public class OrderPage {
    private WebDriver driver;


    // Локаторы для проверки второго сценария
    private final By orderHeader = By.xpath("//div[(text()= 'Для кого самокат')]"); // элемент страницы заполнения данных
    private final By rentHeader = By.xpath("//div[(text()= 'Про аренду')]"); // элемент страницы заполнения данных
    private final By inputName = By.xpath("//input[@placeholder ='* Имя']"); // поле имя
    private final By inputSurname = By.xpath("//input[@placeholder ='* Фамилия']"); // поле фамилия
    private final By inputAddress = By.xpath("//input[@placeholder ='* Адрес: куда привезти заказ']"); // поле адреса
    private final By inputMetroStation = By.xpath("//input[@placeholder ='* Станция метро']"); // поле метро
    private final By inputPhoneNumber = By.xpath("//input[@placeholder ='* Телефон: на него позвонит курьер']"); // поле телефон
    private final By inputDateCalendar = By.xpath("//input[@placeholder ='* Когда привезти самокат']"); // поле календаря
    private final By inputDate = By.xpath("//div[contains(@class, 'day--today')]"); // поле выбора даты доставки
    private final By inputRentalPeriod = By.className("Dropdown-placeholder"); // элемент выбора срока аренды
    private final By inputRentalDay = By.xpath(".//div[@class='Dropdown-menu']/div[text()='сутки']"); // элемент выбора срока аренды
    private final By checkboxColour = By.id("grey"); // элемент выбора цвета
    private final By inputComment = By.xpath("//input[@placeholder ='Комментарий для курьера']"); // поле коментария
    private final By nextButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"); // кнопка далее
    private final By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']//button[contains(text(), 'Заказать')]"); // кнопка заказать
    private final By orderYesButton = By.xpath("//button[contains(text(), 'Да')]"); // кнопка подтверждения заказа
    public final By orderPlacedHeader = By.xpath("//div[(text()= 'Заказ оформлен')]");  // элемент страницы подтвержденного заказа

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


    // Преобразование локаторов в вебэлементы
    public WebElement getName() {
        return driver.findElement(inputName);
    }

    public WebElement getSurname() {
        return driver.findElement(inputSurname);
    }

    public WebElement getAddress() {
        return driver.findElement(inputAddress);
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(inputPhoneNumber);
    }

    public WebElement getStation() {
        return driver.findElement(inputMetroStation);
    }

    public WebElement getCalendar() {
        return driver.findElement(inputDateCalendar);
    }

    public WebElement getDate() {
        return driver.findElement(inputDate);
    }

    public WebElement getRentalPeriod() {
        return driver.findElement(inputRentalPeriod);
    }

    public WebElement getRentalTimeOneDay() {
        return driver.findElement(inputRentalDay);
    }

    public WebElement getColorScooter() {
        return driver.findElement(checkboxColour);
    }

    public WebElement getComment() {
        return driver.findElement(inputComment);
    }

    public WebElement getNextButton() {
        return driver.findElement(nextButton);
    }

    public WebElement getOrderButton() {
        return driver.findElement(orderButton);
    }

    public WebElement getPlaceAnOrderYes() {
        return driver.findElement(orderYesButton);
    }

    public By getTitleOrder() {
        return orderHeader;
    }

    public By getTitleRent() {
        return rentHeader;
    }

}