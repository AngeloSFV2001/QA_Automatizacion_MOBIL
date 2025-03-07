package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    private static WebElement btnClose;

    @AndroidFindBy(id = "2131432049")
    private WebElement searchInput;

    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;

    public void clickClose(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnClose));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnClose.click();
    }
}
