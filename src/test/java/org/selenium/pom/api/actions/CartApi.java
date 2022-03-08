package org.selenium.pom.api.actions;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.selenium.pom.utils.ConfigLoader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CartApi {

    private Cookies cookies;

    public CartApi(){}

    public CartApi(Cookies cookies){
        this.cookies = cookies;
    }

    public Cookies getCookies(){
        return cookies;
    }

    public Response addToCart(String name, String mobile, int menuId, int quantity){

        Cookies cookies = new Cookies();
        //sementara tidak ada login function, bisa new cookies
        Header header = new Header("content-type","application/json" );
        Headers headers = new Headers(header);

        HashMap<String, Object> formParams = new HashMap<>();
        //formParams.put("sentry_key", sentryKey);
        //formParams.put("sentry_version", sentryVersion);
        formParams.put("name", name);
        formParams.put("mobile", mobile);
        formParams.put("id", menuId);
        formParams.put("quantity", quantity);

        if(cookies == null){
            cookies = new Cookies();
        }

        Response response = given()
                .baseUri(ConfigLoader
                        .getInstance()
                        .getBaseApiUrl())
                .headers(headers)
                .formParams(formParams)
                .cookies(cookies)
                .filter(new AllureRestAssured())
                .log().all()
                .when()
                .post("v2/customers/orders/web/")
                .then()
                .log().all()
                .extract().response();
        if (response.getStatusCode() != 200) {
            throw new RuntimeException("Failed to add product to the cart, http response: " + response.getStatusCode());
        }
        this.cookies = response.getDetailedCookies();
        return response;
    }

}
