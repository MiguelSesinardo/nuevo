package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartScreen extends PageObject {

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/itemsTV")
    private WebElement numberItems;

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement nameProduct;

    public String validateNumberItem(){
        waitFor(ExpectedConditions.visibilityOf(numberItems));
        return numberItems.getText();
    }

    public String validateNameProduct(){
        waitFor(ExpectedConditions.visibilityOf(nameProduct));
        return nameProduct.getText();
    }

}
