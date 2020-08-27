package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tarjetaPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public static String tarjeta;
    public static String cvv;
    public static String mes;
    public static String anio;

    @FindBy(xpath = "//h4[contains(text(),'Card Number')]") private WebElement labelTarjeta;
    @FindBy(xpath = "//h4[contains(text(),'CVV')]") private WebElement labelCVV;
    @FindBy(xpath = "//h4[contains(text(),'Exp')]") private WebElement labelFecha;

    public tarjetaPage(WebDriver dvr) {
        driver =dvr;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
        //test
    }

}
