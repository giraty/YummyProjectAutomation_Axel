package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.MenuPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void AddToCartIndividually(){
        MenuPage menuPage = new MenuPage(getDriver());

        menuPage.load()
                .viewMenu()//ini buat pilih penu
                .fillNote("Tambah garam")
                .addToCart()
                .viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();

        // tambah asserts nanti di jumlah per item
    }
}
