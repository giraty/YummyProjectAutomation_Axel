package org.selenium.pom.dataproviders;

import org.selenium.pom.objects.Menu;
import org.selenium.pom.utils.JacksonUtils;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class MenuDataProvider {
    @DataProvider(name ="getAllMenus", parallel = true)
    public Object[] getAllMenus () throws IOException {
        return JacksonUtils.deserializeJson("menus.json", Menu[].class);

    }
}
