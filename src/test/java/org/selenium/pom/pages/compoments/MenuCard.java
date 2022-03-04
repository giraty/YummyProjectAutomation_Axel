package org.selenium.pom.pages.compoments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.CheckoutPage;
import org.selenium.pom.pages.MenuPage;

public class MenuCard extends BasePage {

    private final By addMenuToCartBtn = By.xpath("//div[@class='css-901oao r-jwli3a r-fppytw r-1b43r93 r-vw2c0b r-rjixqe r-p1pxzi r-11wrixw r-61z16t r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-q4m81j r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-3twk1y']");

    private final By viewCartBtn = By.xpath("//div[@class='ButtonFab__ButtonFabContainer-hnUNFQ bUoZfg']");

    private final By notesTextBox = By.xpath("//textarea[@placeholder='Write additional notes here']");
    private final By plusMenu = By.xpath("//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//div[3]//div[1]");

    private final By nameFieldCheckout = By.xpath("//input[@placeholder='Eg: Budi']");
    private final By phoneFieldCheckout = By.xpath("//input[@placeholder='081234567890']");

    private final By checkoutBtn = By.xpath("//div[@class='css-901oao r-jwli3a r-fppytw r-1b43r93 r-vw2c0b r-rjixqe r-p1pxzi r-11wrixw r-61z16t r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-fdjqy7 r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-1ozqkpa']");
    private final By viewCartNotice = By.xpath("//div[@class='css-901oao r-jwli3a r-1ouijob r-1b43r93 r-uiaua r-rjixqe r-p1pxzi r-1jkjb r-1kb76zh r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-fdjqy7 r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-3twk1y']");

    public MenuCard(WebDriver driver){
        super(driver);
    }

    private By getViewMenuElement(String menuName){
        //return By.cssSelector("div[data-testid='“" + menuName + "”']");
        return By.xpath("//div[@data-testid='" + menuName + "']");
    }

    public MenuCard viewMenu(String menuName, int menuAmount, String menuNotes){
        By menuToCart = getViewMenuElement(menuName);
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuToCart)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(notesTextBox)).sendKeys(menuNotes);

        if(menuAmount>1){
            for(int n = menuAmount - 1; n > 0; n--) {
                wait.until(ExpectedConditions.elementToBeClickable(plusMenu)).click();
                System.out.println(n);
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(addMenuToCartBtn)).click();
        return this;
    }

        public MenuCard addToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addMenuToCartBtn)).click();
        return this;
    }

    public MenuCard viewCart(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();
        return this;
    }

    public MenuCard fillBuyerName(String buyerName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameFieldCheckout)).sendKeys(buyerName);
        return this;
    }
    public MenuCard fillBuyerPhoneNumber(String phoneNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFieldCheckout)).sendKeys(phoneNumber);
        return this;
    }

    public CheckoutPage checkoutFood(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
        return new CheckoutPage(driver);
    }

    public String getViewCart(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartNotice)).getText();
    }


}
