package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.compoments.MenuCard;

public class MenuPage extends BasePage {

    private MenuCard menuCard;

    public MenuPage(WebDriver driver) {

        super(driver);
        menuCard = new MenuCard(driver);
        //PageFactory.initElements(driver, this);
    }

    public void setMenuCard(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public MenuPage load(){
        load("/");
        return this;
    }
    public MenuCard getMenuCard() {
        return menuCard;
    }


}
