package org.selenium.pom.pages;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.compoments.MenuCard;

public class MenuPage extends BasePage {

    private MenuCard menuCard;

    public MenuPage(WebDriver driver) {

        super(driver);
        menuCard = new MenuCard(driver);

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
