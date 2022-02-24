package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.dataproviders.MenuDataProvider;
import org.selenium.pom.objects.Menu;
import org.selenium.pom.pages.MenuPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    //nanti tambah assert
    //@Test
/*    public void AddToCartIndividually() {
        MenuPage menuPage = new MenuPage(getDriver());

        menuPage.load()
                .viewMenu()
                .fillNote("Tambah garam")
                .addToCart()
                .viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();


    }*/

    @Test(dataProvider = "getAllMenus", dataProviderClass = MenuDataProvider.class)
    public void AddToCartAll(Menu menu) {
        MenuPage menuPage = new MenuPage(getDriver());

        menuPage.load()
                .getMenuCard()//ini buat pilih penu
                //.addToCart()
                .viewMenu(menu.getMenuId())
                .viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();

        // tambah asserts nanti di jumlah per item
    }
}
