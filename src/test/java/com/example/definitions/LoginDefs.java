package com.example.definitions;

import com.example.steps.LoginSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

import java.util.List;
import java.util.Map;

public class LoginDefs {
    @Steps
    LoginSteps loginSteps;
    @And("I input {string} into address access")
    public void iInputIntoAddressAccess(String addressAccess) {
        loginSteps.inputIntoAddressAccess(addressAccess);
    }

    @And("I click button {string} on the popup")
    public void iClickButtonOnThePopup(String button) {
        loginSteps.clickButtonOnThePopup(button);
    }

    @Then("I verify form login displayed")
    public void iVerifyFormLoginDisplayed() {
        loginSteps.verifyFormLoginDisplayed();
    }

    @And("I input into form with information below")
    public void iInputIntoFormWithInformationBelow(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for(Map<String,String>row:data){
            String userName = row.get("username");
            String password = row.get("password");
            loginSteps.inputIntoUserName(userName);
            loginSteps.inputIntoPassword(password);
        }

    }

    @And("I click button {string} on the form login")
    public void iClickButtonOnTheFormLogin(String button) {
        loginSteps.clickButtonOnTheFormLogin(button);
    }

    @Then("I verify error {string} displayed")
    public void iVerifyErrorDisplayed(String message) {
        loginSteps.verifyErrorDisplayed(message);
    }
}
