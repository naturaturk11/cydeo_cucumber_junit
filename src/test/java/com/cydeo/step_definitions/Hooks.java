package com.cydeo.step_definitions;







import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

import io.cucumber.java.BeforeStep;

/*
in the class we will be able to pre-post conditions  to each scenario and each step
 */
public class Hooks {

    //İMPORT FROM İO.CUCUMBER.JAVA NOT JUNİT
    //@Before(order = 1)
    public void setupScenario() {
        System.out.println("=*=*=*=*=SETTİNG UP BROWSER USİNG CUCUMBER @Before");
    }

    //@Before(value = "@login",order = 2)
    public void setupScenarioForLogins() {
        System.out.println("=<**>==<**>==this will omly apply to scenarios with @login tag");
    }

    // @Before(value = "@db",order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("=<***>==<****>==this will omly apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario() {
        System.out.println("======CLOSİNG BROWSER USİNG CUCUMBER @After");
        System.out.println("======Scenario ended/ take screenshot if failed!");
    }


    @BeforeStep
    public void SetupStep() {
        System.out.println("__beforestep__applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep() {
        System.out.println("______>applying teardown using @AfterStep");


    }



}