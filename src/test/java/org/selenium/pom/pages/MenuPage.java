package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MenuPage extends BasePage {


    private final By asianTofuCard = By.xpath("//div[@data-testid='card-asian-tofu-lasgna']");

    private final By addToCartBtn = By.xpath("//button[@class='ButtonNormal__ButtonNormalPrimary-fdaTzk imsIKD']");
    private final By viewCartBtn = By.xpath("//div[@class='ButtonFab__ButtonFabContainer-hnUNFQ bUoZfg']");

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

    public MenuPage addToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        return this;
    }

    public MenuPage checkoutFood(){

    }


}
