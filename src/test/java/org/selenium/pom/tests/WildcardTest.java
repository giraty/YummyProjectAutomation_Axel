package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.MenuPage;
import org.testng.annotations.Test;

public class WildcardTest extends BaseTest {

    //mencoba dulu sebelum dibuat menurut Factory Design Pattern

    @Test
    public void guestAddThreeLasagnaToCart(){
        //By bumbuAsiaTab = By.xpath("//div[@data-testid='category-menu-bumbu-asia']");

        MenuPage menuPage = new MenuPage(getDriver());

        menuPage.load();



    }

}
