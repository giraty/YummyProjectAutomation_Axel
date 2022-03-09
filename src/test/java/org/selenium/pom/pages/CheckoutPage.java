package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By emailTextBox = By.xpath("//input[@placeholder='Enter your email address']");
    private final By orderPaymentBtn = By.xpath("//button[@type='submit']");

    private final By goPayPayment = By.xpath("//div[contains(text(),'GoPay')]");
    private final By ovoPayment = By.xpath("//div[contains(text(),'OVO')]");

    private final By orderSummaryBtn = By.xpath("//div[@class='css-901oao r-jwli3a r-fppytw r-1b43r93 r-vw2c0b r-rjixqe r-p1pxzi r-11wrixw r-61z16t r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-q4m81j r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-1ozqkpa']");

    private final By continueToPayBtn = By.xpath("(//div[@class='css-901oao r-jwli3a r-fppytw r-1b43r93 r-vw2c0b r-rjixqe r-p1pxzi r-11wrixw r-61z16t r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-q4m81j r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-1ozqkpa'])[1]");

    private final By goPayNotice = By.xpath("//div[@class='css-901oao r-181bzza r-1ouijob r-1b43r93 r-uiaua r-rjixqe r-p1pxzi r-11wrixw r-61z16t r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-q4m81j r-fg3u39 r-13wfysu r-1a2p6p6 r-ll0aj r-3twk1y'][normalize-space()='Open the GOJEK application from your phone, click \"pay\" and scan this QR code to complete your payment']");

    private final By ovoNumber = By.xpath("(//input[@placeholder='Enter your phone number'])[1]");

    private final By ovoNotice = By.xpath("(//div)[52]");

    public CheckoutPage fillBuyerEmail(String emailAddress){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextBox)).sendKeys(emailAddress);
        return this;
    }
    public CheckoutPage goToOrderPayment(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderPaymentBtn)).click();
        return this;
    }

    public CheckoutPage payWithGoPay(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(goPayPayment)).click();
        return this;
    }

    public CheckoutPage payWithOvo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ovoPayment)).click();
        return this;
    }

    public CheckoutPage orderSummary(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderSummaryBtn)).click();
        return this;
    }

    public CheckoutPage continueToPay(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueToPayBtn)).click();
        return this;
    }

    public String getGoPayNotice(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(goPayNotice)).getText();
    }

    public CheckoutPage fillOvoNumber(String ovoPhoneNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ovoNumber)).sendKeys(ovoPhoneNumber);
        return this;
    }

    public String getOvoNotice(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ovoNotice)).getText();
    }

}
