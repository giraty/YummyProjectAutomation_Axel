package org.selenium.pom.api.actions;

import io.restassured.http.Cookies;

public class CartApi {

    private Cookies cookies;

    public CartApi(){}

    public CartApi(Cookies cookies){
        this.cookies = cookies;
    }

    public Cookies getCookies(){
        return cookies;
    }

}
