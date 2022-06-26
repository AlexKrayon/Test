package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class viewAllOrderPage extends BasePage{

    public viewAllOrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
