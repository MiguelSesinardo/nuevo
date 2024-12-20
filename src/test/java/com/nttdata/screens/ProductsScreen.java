package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lblProducto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement productItem1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement productItem2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]")
    private WebElement productItem3;




    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProducto));
        return  lblProducto.isEnabled();
    }

    public void clickProduct(String nameProduct) {

        switch (nameProduct) {
            case "Sauce Labs Backpack":
                productItem1.click();
                break;
            case "Sauce Labs Bolt - T-Shirt":
                productItem2.click();
                break;
            case "Sauce Labs Bike Light":
                productItem3.click();
                break;
            default: System.out.println("Error");

        }
    }




}
