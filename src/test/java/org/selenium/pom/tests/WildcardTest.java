package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.Menu;
import org.selenium.pom.pages.CheckoutPage;
import org.selenium.pom.pages.MenuPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class WildcardTest extends BaseTest {

    //mencoba dulu sebelum dibuat menurut Factory Design Pattern

    //coba ke checkouttest
    @Test
    public void wildcardTestCase() throws IOException {

        MenuPage menuPage = new MenuPage(getDriver());

        Menu menu = new Menu("card-asian-chicken-blackpepper-bowl");

        menuPage.load()
                .getMenuCard()
                .viewMenu("card-asian-chicken-blackpepper-bowl", 2, "Tambah kecap")
                .viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.fillBuyerEmail("emailtes12345@gmail.com")
                    .goToOrderPayment()
                    .payWithGoPay()
                    .orderSummary()
                    .continueToPay();




    }

}
