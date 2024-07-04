package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import com.nttdata.screens.HomeScreen;
import com.nttdata.screens.ProductScreen;
import net.thucydides.core.annotations.Step;

public class MyDemoAppSteps {
    HomeScreen homeScreen;
    CartScreen cartScreen;
    ProductScreen productScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        homeScreen.clickClose();
    }
    @Step("Búsqueda por texto {0},{0}")
    public void searchByText(String place,int Cantidad){
        productScreen.enterSearchInput(place);
        productScreen.clickFirstOption();
        productScreen.clickNext();
        productScreen.clickSearch();
    }
}
