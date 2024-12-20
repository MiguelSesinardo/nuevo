package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class ProductsSteps {

    ProductsScreen productsScreen;

    public void validatePage(){
        Assert.assertTrue("Nose mostro el titulo PRODUCTO",productsScreen.isProductDisplayed());
    }

    public void addProduct(String nameProduct){
        productsScreen.clickProduct(nameProduct);
    }



}
