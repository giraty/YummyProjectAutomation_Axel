package org.selenium.pom.api.actions;

public class DummyClass {
    public static void main(String[] args){
        CartApi cartApi = new CartApi();
        cartApi.addToCart("Budiman", "082225456158", 4, 1);
        System.out.println(cartApi.getCookies());
    }
}
