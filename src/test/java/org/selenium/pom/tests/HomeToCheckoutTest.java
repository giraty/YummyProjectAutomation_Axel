package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.Menu;
import org.selenium.pom.pages.CheckoutPage;
import org.selenium.pom.pages.MenuPage;
import org.selenium.pom.pages.compoments.MenuCard;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeToCheckoutTest extends BaseTest {
    @Test
    public void checkoutUsingGoPayTest() throws IOException {

        MenuPage menuPage = new MenuPage(getDriver());
        MenuCard menuCard = new MenuCard(getDriver());

        menuPage.load()
                .getMenuCard()
                .viewMenu("card-asian-chicken-blackpepper-bowl", 2, "Tambah kecap");

        Assert.assertEquals(menuCard.getViewCart(), "View Cart");

        menuCard.viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.fillBuyerEmail("ipsuman987@gmail.com")
                .goToOrderPayment()
                .payWithGoPay()
                .orderSummary()
                .continueToPay();

        Assert.assertEquals(checkoutPage.getGoPayNotice(), "Open the GOJEK application from your phone, click \"pay\" and scan this QR code to complete your payment");


    }

    @Test
    public void checkoutUsingOvoTest() throws IOException {

        MenuPage menuPage = new MenuPage(getDriver());
        MenuCard menuCard = new MenuCard(getDriver());

        menuPage.load()
                .getMenuCard()
                .viewMenu("card-asian-tofu-lasgna", 4, "Tambah saus tomat");

        Assert.assertEquals(menuCard.getViewCart(), "View Cart");

        menuCard.viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.fillBuyerEmail("ipsuman987@gmail.com")
                .goToOrderPayment()
                .payWithOvo()
                .orderSummary()
                .fillOvoNumber("08123456789")
                .continueToPay();

        Assert.assertEquals(checkoutPage.getOvoNotice(), "Please wait a moment, we are checking your OVO payment data");


    }

    @Test
    public void checkoutChangeFromGopayToOvoTest() throws IOException {

        MenuPage menuPage = new MenuPage(getDriver());
        MenuCard menuCard = new MenuCard(getDriver());

        menuPage.load()
                .getMenuCard()
                .viewMenu("card-asian-tofu-lasgna", 4, "Tambah saus tomat");

        Assert.assertEquals(menuCard.getViewCart(), "View Cart");

        menuCard.viewCart()
                .fillBuyerName("Ipsuman")
                .fillBuyerPhoneNumber("0812345679")
                .checkoutFood();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.fillBuyerEmail("ipsuman987@gmail.com")
                .goToOrderPayment()
                .payWithGoPay()
                .orderSummary()
                .continueToPay();

        Assert.assertEquals(checkoutPage.getGoPayNotice(), "Open the GOJEK application from your phone, click \"pay\" and scan this QR code to complete your payment");

        checkoutPage.changePaymentMethod()
                .payWithOvo()
                .orderSummary()
                .fillOvoNumber("08123456789")
                .continueToPay();

        Assert.assertEquals(checkoutPage.getOvoNotice(), "Please wait a moment, we are checking your OVO payment data");
    }
}
