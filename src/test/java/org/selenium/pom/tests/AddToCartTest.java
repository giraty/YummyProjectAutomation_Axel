package org.selenium.pom.tests;

import org.testng.Assert;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.dataproviders.MenuDataProvider;
import org.selenium.pom.objects.Menu;
import org.selenium.pom.pages.MenuPage;
import org.selenium.pom.pages.compoments.MenuCard;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartTest extends BaseTest {

    //nanti tambah assert
    @Test
    public void AddToCartOneProduct() throws IOException {
        MenuPage menuPage = new MenuPage(getDriver());

        Menu menu = new Menu("card-asian-chicken-blackpepper-bowl");

        menuPage.load()
                .getMenuCard()
                .viewMenu("card-asian-chicken-blackpepper-bowl", 2, "Tambah kecap")
                .viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();


    }

    @Test
    public void AddToCartAllProduct() throws IOException {
        MenuPage menuPage = new MenuPage(getDriver());

        //Menu menu = new Menu("card-asian-chicken-blackpepper-bowl");

        menuPage.load()
                .getMenuCard()
                .viewMenu("card-asian-chicken-blackpepper-bowl", 1, "Tambah kecap")
                .viewMenu("card-asian-beef-blackpepper-bento", 3, "")
                .viewMenu("card-asian-beef-blackpepper-bowl", 4, "Tambah saus")
                .viewMenu("card-asian-tofu-lasgna", 2, "Tidak pedas")
                .viewMenu("card-asian-chicken-blackpepper-bento", 6, "")
                .viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();


    }

    @Test(dataProvider = "getAllMenus", dataProviderClass = MenuDataProvider.class)
    public void AddToCartAllDifferentOrder(Menu menu) {
        MenuPage menuPage = new MenuPage(getDriver());
        MenuCard menuCard = new MenuCard(getDriver());

        menuPage.load()
                .getMenuCard()//ini buat pilih penu
                .viewMenu(menu.getMenuId(), menu.getAmount(),menu.getNotes());

        Assert.assertEquals(menuCard.getViewCart(), "View Cart");


    }
}
