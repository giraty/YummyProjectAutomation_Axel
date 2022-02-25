package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.compoments.MenuCard;

public class MenuPage extends BasePage {

    private MenuCard menuCard;

    public MenuPage(WebDriver driver) {

        super(driver);
        menuCard = new MenuCard(driver);
        //PageFactory.initElements(driver, this);
    }

    public void setMenuCard(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    //By bumbuAsiaTab = By.xpath("//div[@data-testid='category-menu-bumbu-asia']");
    //temporary solution for add to cart


    private final By asianTofuCard = By.cssSelector("div[data-testid='card-asian-tofu-lasgna']");
    //private final By asianTofuCard = By.xpath("//div[@data-testid='card-asian-tofu-lasgna']//div[@class='ant-card ant-card-bordered ant-card-hoverable']");


    private final By notesTextBox = By.xpath("//textarea[@placeholder='Write additional notes here']");
    //private final By addToCartBtn = By.xpath("//button[@class='ButtonNormal__ButtonNormalPrimary-fdaTzk imsIKD']");

    private final By viewCartNotice = By.xpath("//div[@class='css-901oao r-jwli3a r-1ouijob r-1b43r93 r-uiaua r-rjixqe r-p1pxzi r-1jkjb r-1kb76zh r-1mnahxq r-g18oep r-gy4na3 r-9aemit r-fdjqy7 r-paz4er r-13wfysu r-1a2p6p6 r-ll0aj r-3twk1y']");
    private final By viewCartBtn = By.xpath("//div[@class='ButtonFab__ButtonFabContainer-hnUNFQ bUoZfg']");

    //plus minus saat tambah ke cart
    private final By minusMenu = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[1]//div[1]");
    private final By plusMenu = By.xpath("//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//div[3]//div[1]");


    //plus minus saat akan checkout
    private final By minusCart = By.xpath("//body//div//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[1]//div[1]");
    private final By plusCart = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1777fci']//div[3]//div[1]");


    //button[@class='ButtonNormal__ButtonNormalPrimary-fdaTzk imsIKD']
    public MenuPage load(){
        load("/");
        //wait.until(ExpectedConditions.titleContains("AskOmDch"));
        return this;
    }

    public MenuCard getMenuCard() {
        return menuCard;
    }

    public MenuPage viewMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(asianTofuCard)).click();
        return this;
    }

    public String getViewCart(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartNotice)).getText();
    }

/*    public MenuPage addMenuAmount(int amount){
        if(amount>1){
            //int n = amount - 1;
            //int n;
            for(int n = amount - 1; n > 0; n--) {
                wait.until(ExpectedConditions.elementToBeClickable(plusMenu)).click();
                System.out.println(n);

            }
        }

        return this;
    }*/

    public MenuPage fillNote(String notes){

        wait.until(ExpectedConditions.visibilityOfElementLocated(notesTextBox)).sendKeys(notes);
        return this;

    }




/*    public MenuPage setBuyerInfo(MenuPage menuPage){

    }*/

    //username? buyerName? Name? TBA



/*    private MenuPage enterBuyerName(String BuyerName){


    }
    private MenuPage enterBuyerPhoneNumber(String BuyerPhoneNumber){


    }*/


}
