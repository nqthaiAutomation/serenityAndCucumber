package com.example.definitions;

import com.example.steps.RegisterSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class RegisterDefs {
    @Steps
    RegisterSteps registerSteps;
    @Then("I switch tab {string}")
    public void iSwitchTab(String titlePage) {
        registerSteps.switchTab(titlePage);

    }
}
