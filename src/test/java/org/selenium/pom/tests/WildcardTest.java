package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.MenuPage;
import org.testng.annotations.Test;

public class WildcardTest extends BaseTest {

    //mencoba dulu sebelum dibuat menurut Factory Design Pattern

    //@Test
    public void wildcardTestCase(){


        MenuPage menuPage = new MenuPage(getDriver());

        menuPage.load()
                .viewMenu()// ini buat pilih menu
                .fillNote("Tambah garam");
                //.addMenuAmount(5);
                //.addToCart()
                //.viewCart()
                //.fillBuyerName("Ipsuman")
                //.fillBuyerPhoneNumber("0812345679")
                //.checkoutFood();



    }

}
