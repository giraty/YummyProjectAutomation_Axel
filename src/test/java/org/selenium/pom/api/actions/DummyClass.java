package org.selenium.pom.api.actions;

public class DummyClass {
    public static void main(String[] args){
        CartApi cartApi = new CartApi();
        cartApi.addToCart("eac76e27bd334bdf97e122c428733586",7);
        System.out.println(cartApi.getCookies());
    }
}
