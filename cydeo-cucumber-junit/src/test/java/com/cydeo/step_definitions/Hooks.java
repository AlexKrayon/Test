package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setupScenario(){
        System.out.println("***Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(Scenario scenario) throws InterruptedException {



       if(scenario.isFailed()){
           byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png",scenario.getName());
       }



       Thread.sleep(5000);

        Driver.closeDriver();
        //System.out.println("***Closing browser using cucumber @After");

    }

    @BeforeStep
    public void setupStep(){
        System.out.println("New step is starting from here.****************");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("*********************************");
    }


}
