package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MenuPage extends BasePage {

    //By bumbuAsiaTab = By.xpath("//div[@data-testid='category-menu-bumbu-asia']");
    //temporary solution for add to cart


    private final By asianTofuCard = By.cssSelector("div[data-testid='card-asian-tofu-lasgna']");
    //private final By asianTofuCard = By.xpath("//div[@data-testid='card-asian-tofu-lasgna']//div[@class='ant-card ant-card-bordered ant-card-hoverable']");


    private final By notesTextBox = By.xpath("//textarea[@placeholder='Write additional notes here']");
    private final By addToCartBtn = By.xpath("//button[@class='ButtonNormal__ButtonNormalPrimary-fdaTzk imsIKD']");
    private final By viewCartBtn = By.xpath("//div[@class='ButtonFab__ButtonFabContainer-hnUNFQ bUoZfg']");

    //plus minus saat tambah ke cart
    private final By minusMenu = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[1]//div[1]");
    private final By plusMenu = By.xpath("//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//div[3]//div[1]");

    //plus minus saat akan checkout
    private final By minusCart = By.xpath("//body//div//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[1]//div[1]");
    private final By plusCart = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[3]//div[1]");


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

    public MenuPage fillNote(String notes){
        wait.until(ExpectedConditions.visibilityOfElementLocated(notesTextBox)).sendKeys(notes);
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
    public MenuPage fillBuyerName(String buyerName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameFieldCheckout)).sendKeys(buyerName);
        return this;
    }
    public MenuPage fillBuyerPhoneNumber(String phoneNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFieldCheckout)).sendKeys(phoneNumber);
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
