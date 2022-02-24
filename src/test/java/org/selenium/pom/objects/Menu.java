package org.selenium.pom.objects;

import org.selenium.pom.utils.JacksonUtils;

import java.io.IOException;

public class Menu {

    private String menuId;
    private int amount;
    private String notes;

    public Menu(){}

    public Menu(String menuId) throws IOException {

        Menu[] menus = JacksonUtils.deserializeJson("menus.json", Menu[].class);
        for(Menu menu: menus){
            if (menu.getMenuId().equals(menuId)){
                this.menuId = menuId;
                this.amount = menu.getAmount();
                this.notes = menu.getNotes();
            }
        }
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }





}
