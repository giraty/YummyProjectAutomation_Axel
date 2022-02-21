package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MenuPage extends BasePage {

    //By bumbuAsiaTab = By.xpath("//div[@data-testid='category-menu-bumbu-asia']");
    private final By asianTofuCard = By.xpath("//div[@data-testid='card-asian-tofu-lasgna']//div[@class='ant-card ant-card-bordered ant-card-hoverable']");

    //temporary solution for add to cart
    private final By addToCartBtn = By.xpath("//button[@class='ButtonNormal__ButtonNormalPrimary-fdaTzk imsIKD']");
    private final By viewCartBtn = By.xpath("//div[@class='ButtonFab__ButtonFabContainer-hnUNFQ bUoZfg']");

    private final By nameFieldCheckout = By.xpath("//input[@placeholder='Eg: Budi']");
    private final By phoneFieldCheckout = By.xpath("//input[@placeholder='081234567890']");

    private final By checkoutBtn = By.xpath("//div[@class='css-901oao r-jwli3a r-fppytw r-1b43r93 r-vw2c0b r-rjixqe r-p1pxzi r-11wrixw r-61z16t r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-fdjqy7 r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-1ozqkpa']");

    public MenuPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }
    //button[@class='ButtonNormal__ButtonNormalPrimary-fdaTzk imsIKD']
    public MenuPage load(){
        load("/");
        //wait.until(ExpectedConditions.titleContains("AskOmDch"));
        return this;
    }

    public MenuPage viewMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(asianTofuCard)).click();
        return this;
    }

    public MenuPage addToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        return this;
    }

    public MenuPage viewCart(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();
        return this;
    }

/*    public MenuPage setBuyerInfo(MenuPage menuPage){

    }*/

    //username? buyerName? Name? TBA
    public MenuPage fillBuyerName(String buyername){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameFieldCheckout)).sendKeys(buyername);
        return this;
    }
    public MenuPage fillBuyerPhoneNumber(String phonenumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFieldCheckout)).sendKeys(phonenumber);
        return this;
    }

    public MenuPage checkoutFood(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
        return this;
    }


/*    private MenuPage enterBuyerName(String BuyerName){


    }
    private MenuPage enterBuyerPhoneNumber(String BuyerPhoneNumber){


    }*/


}
