package com.example.definitions;

import com.example.pages.HomePage;
import com.example.steps.HomeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class HomeDefs {

    @Steps
    HomeSteps homeSteps;
    HomePage homePage;

    @Given("User is on Home page")
    public void userIsOnHomePage() {

        homePage.openHomePage();
    }
    @And("I click link into {string} on the header page")
    public void iClickLinkIntoOnTheHeaderPage(String links) {
        homeSteps.clickLinkIntoOnTheHeaderPage(links);
    }


    @And("I click button {string} on the header page")
    public void iClickButtonOnTheHeaderPage(String button) {
        homeSteps.clickButtonOnTheHeaderPage(button);
    }
}
